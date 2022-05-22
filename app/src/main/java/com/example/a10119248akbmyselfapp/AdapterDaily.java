package com.example.a10119248akbmyselfapp;
// 07 Mei - 10119248 - Syifa Nur Afifah - IF6

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDaily extends RecyclerView.Adapter<AdapterDaily.ViewHolder> {

    private ArrayList<DailyModel> dataItem;

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        ImageView imageIcon;

        ViewHolder(View v) {

            super(v);

            textHead = v.findViewById(R.id.daily_headline);
            textSubhead = v.findViewById(R.id.daily_subhead);
            imageIcon = v.findViewById(R.id.dailyimg);
        }
    }

    AdapterDaily(ArrayList<DailyModel> data) {

        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterDaily.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_item, parent, false);
        //myonClickListener
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubhead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return dataItem.size();
    }
}
