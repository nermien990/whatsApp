package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCallAdapter extends RecyclerView.Adapter<RecyclerCallAdapter.RecycleCallHolder> {

    ArrayList<Call> data;

    public RecyclerCallAdapter(ArrayList<Call> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecycleCallHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_call, parent, false);
        RecycleCallHolder holder = new RecycleCallHolder(view);
        return holder;    }

    @Override
    public void onBindViewHolder(@NonNull RecycleCallHolder holder, int position) {

        final Call calls = data.get(position);
        holder.call.setText(calls.getCall_name());
        holder.im_call.setImageResource(calls.getImage_call());
        holder.cim.setImageResource(calls.getCall_img());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    class RecycleCallHolder extends RecyclerView.ViewHolder{

        TextView call;
        ImageView im_call, cim;

        public RecycleCallHolder(@NonNull View itemView) {
            super(itemView);
            call = itemView.findViewById(R.id.call_name);
            im_call = itemView.findViewById(R.id.call_img);
            cim = itemView.findViewById(R.id.c_img);
        }

    }
}
