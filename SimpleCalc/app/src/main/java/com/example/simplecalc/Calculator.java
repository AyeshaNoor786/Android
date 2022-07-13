package com.example.simplecalc;

public class Calculator {

    public enum Operator{Add,Sub,Mul,Div}

    public double add(double firstOperand, double secondOpenand){
        return firstOperand+secondOpenand;
    }

    public double sub(double firstOperand, double secondOpenand){
        return firstOperand-secondOpenand;
    }

    public double mul(double firstOperand, double secondOpenand){
        return firstOperand*secondOpenand;
    }

    public double div(double firstOperand, double secondOpenand){
        return firstOperand/secondOpenand;
    }
}
