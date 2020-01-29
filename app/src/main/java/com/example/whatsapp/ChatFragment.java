package com.example.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    View view;
    RecyclerView recyclerView;
    private int REQ_CODE;

    public ChatFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.item_one, container, false);
        recyclerView = view.findViewById(R.id.recycler_chat);

        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(R.drawable.image1, "coffee1"));
        chats.add(new Chat(R.drawable.image2, "coffee2"));
        chats.add(new Chat(R.drawable.image3, "coffee3"));

        RecyclerChatAdapter adapter = new RecyclerChatAdapter(chats, new MyInterface() {
            @Override
            public void OnItemClic(int img_res) {
                Intent i = new Intent(getContext(), ImageShow.class);
                i.putExtra("show", img_res);
                startActivityForResult(i, REQ_CODE);

            }
        });
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

        return view;

    }



}
