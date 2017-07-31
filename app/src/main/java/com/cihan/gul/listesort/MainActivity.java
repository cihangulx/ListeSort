package com.cihan.gul.listesort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Urun> urunList;
    UrunAdapter urunAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        urunList = new ArrayList<>();

        urunList.add(new Urun("Intel Kaby Lake i3 7100",
                "http://www.teknobiyotik.com/media/catalog/product/cache/4/image/326x265/c82fc2f55655ae2bd6f823b09b71ac50/d/k/dk-ch-ninja_disgorsel_01_v3_1_2_1.jpg",
                2865.50
        ));
        urunList.add(new Urun("Asus RX580 8GB 256Bit",
                "http://www.teknobiyotik.com/media/catalog/product/cache/4/image/326x265/c82fc2f55655ae2bd6f823b09b71ac50/g/g/gggb.jpg",
                2656.10
        ));
        urunList.add(new Urun("Lenovo G50-70 15.6",
                "http://www.teknobiyotik.com/media/catalog/product/cache/4/image/326x265/c82fc2f55655ae2bd6f823b09b71ac50/v/2/v2-73198-3_large-700x550.jpg",
                2402.40
        ));

        urunList.add(new Urun("Philips 24\" 241S4LCB",
                "http://www.teknobiyotik.com/media/catalog/product/cache/4/image/326x265/c82fc2f55655ae2bd6f823b09b71ac50/o/r/original_14.jpg",
                776.31
        ));
        urunList.add(new Urun("A4 Tech XL-750BH ",
                "http://www.teknobiyotik.com/media/catalog/product/cache/4/image/326x265/c82fc2f55655ae2bd6f823b09b71ac50/p/b/pbp1-12458.jpg",
                96.62
        ));
        urunList.add(new Urun("Dark EVO Business BS102  ",
                "http://www.teknobiyotik.com/media/catalog/product/cache/4/image/326x265/c82fc2f55655ae2bd6f823b09b71ac50/a/u/auro_pc_1.jpg",
                877.97
        ));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,2,GridLayoutManager.VERTICAL,false);
        urunAdapter = new UrunAdapter(MainActivity.this, urunList);
        recyclerView.setAdapter(urunAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public void sort(View view) {

        Collections.sort(urunList, new Comparator<Urun>() {
            @Override
            public int compare(Urun o1, Urun o2) {
                return new Double(o1.getPrice()).compareTo(o2.getPrice());
            }
        });
        urunAdapter.notifyDataSetChanged();
    }
    public void aSort(View view) {
        Collections.sort(urunList, new Comparator<Urun>() {
            @Override
            public int compare(Urun o1, Urun o2) {
                return new Double(o2.getPrice()).compareTo(o1.getPrice());
            }
        });

        urunAdapter.notifyDataSetChanged();

    }
}
