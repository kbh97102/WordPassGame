package com.example.wordpassgame.recycler;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wordpassgame.databinding.ComputerMessageBinding;

public class ComputerMessageHolder extends RecyclerView.ViewHolder {

    public ComputerMessageBinding binding;

    public ComputerMessageHolder(ComputerMessageBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(WordInfo wordInfo) {
        binding.textviewComputerWord.setText(wordInfo.word);
    }
}
