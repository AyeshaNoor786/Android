package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CalculatorActivity";

    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalculator = new Calculator();
        mResultTextView = findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text);
    }

    public void onAdd(View view) {
        compute(Calculator.Operator.Add);
    }

    public void onSub(View view) {
        compute(Calculator.Operator.Sub);
    }

    public void onDiv(View view) {
        try {
            compute(Calculator.Operator.Div);
        } catch (IllegalArgumentException iae) {
            Log.e(TAG, "IllegalArgumentException", iae);
            mResultTextView.setText(getString(R.string.computationError));
        }
    }

    public void onMul(View view) {
        compute(Calculator.Operator.Mul);
    }

    private void compute(Calculator.Operator operator){
        double operandOne;
        double operandTwo;
        try{
            operandOne = getOperand(mOperandOneEditText);
            operandTwo = getOperand(mOperandTwoEditText);
        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NumberFormatException", nfe);
            mResultTextView.setText(getString(R.string.computationError));
            return;
        }

        String result;
        switch (operator){
            case Add:
                result = String.valueOf(mCalculator.add(operandOne,operandTwo));
                break;
            case Sub:
                result = String.valueOf(
                        mCalculator.sub(operandOne, operandTwo));
                break;
            case Div:
                result = String.valueOf(
                        mCalculator.div(operandOne, operandTwo));
                break;
            case Mul:
                result = String.valueOf(
                        mCalculator.mul(operandOne, operandTwo));
                break;
            default:
                result = getString(R.string.computationError);
                break;
        }
        mResultTextView.setText(result);
    }

    private static double getOperand(EditText edtOperand){
        String openandtxt = getOperandText(edtOperand);
        return Double.valueOf(openandtxt);
    }
    private static String getOperandText(EditText edtOperand){
        return edtOperand.getText().toString();
    }
}