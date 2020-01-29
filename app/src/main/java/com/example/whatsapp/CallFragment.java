package com.example.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallFragment extends Fragment {

    View view;
    RecyclerView recyclerView ;

    public CallFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.item_two, container, false);
        recyclerView = view.findViewById(R.id.recycler_call);

        ArrayList<Call> calls = new ArrayList<>();
        calls.add(new Call(R.drawable.image4, "coffee4"));
        calls.add(new Call(R.drawable.image5, "coffee5"));
        calls.add(new Call(R.drawable.image6, "coffee6"));

        RecyclerCallAdapter adapter = new RecyclerCallAdapter(calls);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
