package com.example.simple_recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.alphaHandler> {

    Context context;
    ArrayList<alphabets> arrAlpha;

    private int lastPos = -1;

    public recyclerAdapter(Context context, ArrayList<alphabets> arrAlpha) {
        this.context = context;
        this.arrAlpha = arrAlpha;
    }

    @NonNull
    @Override
    public alphaHandler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.row_item,parent,false);
        alphaHandler alphabets = new alphaHandler(v);

        return alphabets;
    }

    @Override
    public void onBindViewHolder(@NonNull alphaHandler holder, int position) {
        holder.txtAlpha.setText(arrAlpha.get(position).alpha);
        holder.txtName.setText(arrAlpha.get(position).name);
        holder.img.setImageResource(arrAlpha.get(position).img);

        setAnimation(holder.itemView,position);

    }

    @Override
    public int getItemCount() {
        return arrAlpha.size();
    }

    public class alphaHandler extends RecyclerView.ViewHolder{
        TextView txtAlpha,txtName;
        ImageView img;
        public alphaHandler(@NonNull View itemView) {
            super(itemView);

            txtAlpha = itemView.findViewById(R.id.alpha);
            txtName = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.img);

        }
    }

    private void setAnimation(View v,int position){
        if(position > lastPos) {
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            v.startAnimation(slideIn);
            lastPos = position;
        }
    }

}
