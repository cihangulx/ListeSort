package com.cihan.gul.listesort;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cihan on 31.07.2017.
 */

public class UrunViewHolder extends RecyclerView.ViewHolder {
    TextView tv_name;
    TextView tv_price;
    ImageView iv_image;

    public UrunViewHolder(View itemView) {
        super(itemView);
        tv_name=(TextView)itemView.findViewById(R.id.tv_name);
        tv_price=(TextView)itemView.findViewById(R.id.tv_price);
        iv_image=(ImageView)itemView.findViewById(R.id.iv_image);

    }
}
