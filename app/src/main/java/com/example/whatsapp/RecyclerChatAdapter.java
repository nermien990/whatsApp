package com.example.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static androidx.core.app.ActivityCompat.startActivityForResult;

public class RecyclerChatAdapter extends RecyclerView.Adapter<RecyclerChatAdapter.RecycleChatHolder> {

    ArrayList<Chat> data;
    private MyInterface listener;

    public RecyclerChatAdapter( ArrayList<Chat> data, MyInterface listener) {
        this.data = data;
        this.listener = listener;
    }

    public RecyclerChatAdapter(ArrayList<Chat> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecycleChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_chat_item, parent, false);
        RecycleChatHolder holder = new RecycleChatHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleChatHolder holder, int position) {

        final Chat chat = data.get(position);
        holder.chat.setText(chat.getChat_name());
        holder.im_chat.setImageResource(chat.getImage_chat());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class RecycleChatHolder extends RecyclerView.ViewHolder{

        TextView chat;
        ImageView im_chat;

        public RecycleChatHolder(@NonNull View itemView) {
            super(itemView);
            chat = itemView.findViewById(R.id.chat_name);
            im_chat = itemView.findViewById(R.id.chat_img);

            im_chat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.OnItemClic(1);
                }
            });

        }

    }
}
