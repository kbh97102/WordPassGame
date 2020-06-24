package com.example.wordpassgame.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wordpassgame.databinding.ComputerMessageBinding;
import com.example.wordpassgame.databinding.UserMessageBinding;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int COMPUTER_MESSAGE = 1;
    private static final int USER_MESSAGE = 2;

    private ArrayList<WordInfo> words;

    public RecyclerAdapter(ArrayList<WordInfo> words) {
        this.words = words;
    }

    @Override
    public int getItemViewType(int position) {
        WordInfo word = words.get(position);

        if (word.type == USER_MESSAGE) {
            return USER_MESSAGE;
        } else {
            return COMPUTER_MESSAGE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        if (viewType == USER_MESSAGE) {
            UserMessageBinding userMessageBinding = UserMessageBinding.inflate(layoutInflater, parent, false);
            return new UserMessageHolder(userMessageBinding);
        }
        else{
            ComputerMessageBinding computerMessageBinding = ComputerMessageBinding.inflate(layoutInflater, parent, false);
            return new ComputerMessageHolder(computerMessageBinding);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if(holder.getItemViewType() == USER_MESSAGE){
            ((UserMessageHolder) holder).bind(words.get(position));
        }
        else{
            ((ComputerMessageHolder)holder).bind(words.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return words.size();
    }
}
