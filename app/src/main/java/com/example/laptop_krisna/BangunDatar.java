package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BangunDatar extends AppCompatActivity {
    String datarList[]={"Persegi","Persegi panjang","Segitiga","Jajar genjang","Trapesium","Lingkaran","Belah ketupat","layang-layang"};
    int datarImages[] = {R.drawable.persegi,R.drawable.persegipanjang,R.drawable.segitiga,R.drawable.jajargenjang,R.drawable.trapesium,R.drawable.lingkaran,R.drawable.belahketupat,R.drawable.layanglayang};
//    String deskripsi[]={"Persegi","Persegi panjang","Segitiga","Jajar genjang","Trapesium","lingkaran","Belahketupat","layang"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_datar);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter AdapterKalkulator= new CustomBaseAdapter(getApplicationContext(),datarList,datarImages);
        listView.setAdapter(AdapterKalkulator);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.i("CUSTOM_LIST_VIEW", "Item is clicked @i :" + i);

                if(i==0) {
                    startActivity(new Intent(BangunDatar.this,Persegi.class));

                }else if (i==1){
                    startActivity(new Intent(BangunDatar.this,PersegiPanjang.class));
                }else if (i==2){
                    startActivity(new Intent(BangunDatar.this,Segitiga.class));
                }else if (i==3){
                    startActivity(new Intent(BangunDatar.this,JajarGenjang.class));
                }else if (i==4){
                    startActivity(new Intent(BangunDatar.this,Trapesium.class));
                }else if (i==5){
                    startActivity(new Intent(BangunDatar.this,Lingkaran.class));
                }else if (i==6){
                    startActivity(new Intent(BangunDatar.this,BelahKetupat.class));
                }else if (i==7){
                    startActivity(new Intent(BangunDatar.this,layanglayang.class));
                }

            }
        });

    }
}