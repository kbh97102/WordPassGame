package com.example.wordpassgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.wordpassgame.databinding.ActivityMainBinding;
import com.example.wordpassgame.recycler.RecyclerAdapter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter();
        binding.reyclerviewMessageList.setAdapter(recyclerAdapter);
        binding.reyclerviewMessageList.setLayoutManager(new LinearLayoutManager(this));
    }
}