package com.example.wordpassgame.recycler;

import androidx.recyclerview.widget.RecyclerView;

import com.example.wordpassgame.databinding.UserMessageBinding;

public class UserMessageHolder extends RecyclerView.ViewHolder {

    public UserMessageBinding binding;

    public UserMessageHolder(UserMessageBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(WordInfo wordInfo) {
        binding.textviewUserWord.setText(wordInfo.word);
    }
}
