package com.cihan.gul.listesort;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Cihan on 31.07.2017.
 */

public class UrunAdapter extends RecyclerView.Adapter<UrunViewHolder> {

    List<Urun> urunList;
    Activity activity;

    public UrunAdapter(Activity activity, List<Urun> urunList) {
        this.urunList = urunList;
        this.activity = activity;

    }

    @Override
    public UrunViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);

        UrunViewHolder urunViewHolder = new UrunViewHolder(view);

        return urunViewHolder;
    }

    @Override
    public void onBindViewHolder(UrunViewHolder holder, int position) {


        holder.tv_name.setText(urunList.get(position).getName());
        holder.tv_price.setText("Fiyat: "+urunList.get(position).getPrice()+" TL");

        if (urunList.get(position).getImageUrl()!=null)
            Picasso.with(activity).load(urunList.get(position).getImageUrl()).into(holder.iv_image);


    }

    @Override
    public int getItemCount() {
        return urunList.size();
    }
}
