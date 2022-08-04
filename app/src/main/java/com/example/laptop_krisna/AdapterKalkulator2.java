package com.example.laptop_krisna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterKalkulator2 extends BaseAdapter {
    Context context;
    String ruangList[];
    int ruangImages[];
    LayoutInflater inflater;

    public AdapterKalkulator2(Context ctx, String[] ruangList, int[] images) {
        this.context = ctx;
        this.ruangList = ruangList;
        this.ruangImages = images;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return ruangList.length;
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
        ImageView ruangImg = (ImageView) convertView.findViewById(R.id.imageIcon);
        txtView.setText(ruangList[i]);
        ruangImg.setImageResource(ruangImages[i]);
        return convertView;

    }
}
