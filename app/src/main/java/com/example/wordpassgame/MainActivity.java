package com.example.wordpassgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.wordpassgame.databinding.ActivityMainBinding;
import com.example.wordpassgame.recycler.RecyclerAdapter;
import com.example.wordpassgame.recycler.WordInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<WordInfo> words;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        words = new ArrayList<>();

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(words);
        binding.reyclerviewMessageList.setAdapter(recyclerAdapter);
        binding.reyclerviewMessageList.setLayoutManager(new LinearLayoutManager(this));
    }
}