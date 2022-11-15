package com.example.chessai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import Models.ResaultsIn;

public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<ResaultsIn> states;

    Adapter(Context context, List<ResaultsIn> states) {
        this.states = states;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_resaults, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        ResaultsIn state = states.get(position);

        holder.nameView.setText(state.getResName());
        int minuties = (state.getResTime()%3600)/60;
        int secon = state.getResTime()%60;
        String time = String.format("%02d:%02d", minuties, secon);
        holder.capitalView.setText(time);
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView, capitalView;
        ViewHolder(View view){
            super(view);
            nameView = view.findViewById(R.id.timeRes);
            capitalView = view.findViewById(R.id.nameRes);
        }
    }
}