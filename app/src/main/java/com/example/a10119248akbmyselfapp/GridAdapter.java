package com.example.a10119248akbmyselfapp;
// 08 Mei - 10119248 - Syifa Nur Afifah - IF6

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    List<GridItem> mItems;

    public GridAdapter() {
        super();
        mItems = new ArrayList<GridItem>();
        GridItem nama = new GridItem();
        nama.setThumbnail(R.drawable.mc1);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.mc2);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.hima1);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.hima2);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.teman1);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.teman2);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.geng1);
        mItems.add(nama);

        nama = new GridItem();
        nama.setThumbnail(R.drawable.geng2);
        mItems.add(nama);


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        GridItem nature = mItems.get(i);
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder  {


        public ImageView imgThumbnail;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);

        }
    }
}
