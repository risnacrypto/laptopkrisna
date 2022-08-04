package com.example.laptop_krisna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterKalkulator extends BaseAdapter {
    Context context;
    String datarList[];
    int datarImages[];
    String deskripsi[];
    LayoutInflater inflater;

    public AdapterKalkulator(Context ctx, String[] datarList,int[] images, String[]deskripsi) {
        this.context = ctx;
        this.datarList = datarList;
        this.datarImages = images;
        this.deskripsi = deskripsi;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return datarList.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView  = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView = (TextView)  convertView.findViewById(R.id.textView);
        ImageView datarImg = (ImageView) convertView.findViewById(R.id.imageIcon);
        TextView txtView2 = (TextView)  convertView.findViewById(R.id.deskripsi);
        datarImg.setImageResource(datarImages[i]);
        txtView2.setText(deskripsi[i]);
        return convertView;

    }
}

