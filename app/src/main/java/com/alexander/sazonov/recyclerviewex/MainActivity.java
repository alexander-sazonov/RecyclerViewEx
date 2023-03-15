package com.alexander.sazonov.recyclerviewex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView list = findViewById(R.id.list);
        ChatAdapter adapter = new ChatAdapter();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        List<Chat> data = new ArrayList<>();
        data.add(new Chat(1,"Ivan", "Hello !!!", R.drawable.avatar_1));
        data.add(new Chat(2,"Ilon", "How are you?", R.drawable.avatar_2));
        list.setAdapter(adapter);
        list.setLayoutManager(layoutManager);
        adapter.submitList(data);
    }
}