package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class BangunRuang extends AppCompatActivity {
    String ruangList[]={"Kubus","Balok","Tabung","kerucut","Prisma","Limas","bola"};
    int ruangImages[] = {R.drawable.kubus, R.drawable.balok, R.drawable.tabung, R.drawable.kerucut, R.drawable.prisma, R.drawable.limas, R.drawable.bola};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_ruang);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter AdapterKalkulator2 = new CustomBaseAdapter(getApplicationContext(),ruangList,ruangImages);
        listView.setAdapter(AdapterKalkulator2);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Log.i("CUSTOM_LIST_VIEW", "Item is clicked @i ::" + i);
                if(i==0) {
                    startActivity(new Intent(BangunRuang.this,Persegi.class));

                }else if (i==1){
                    startActivity(new Intent(BangunRuang.this,PersegiPanjang.class));
                }else if (i==2){
                    startActivity(new Intent(BangunRuang.this,Segitiga.class));
                }else if (i==3){
                    startActivity(new Intent(BangunRuang.this,JajarGenjang.class));
                }else if (i==4){
                    startActivity(new Intent(BangunRuang.this,Trapesium.class));
                }else if (i==5){
                    startActivity(new Intent(BangunRuang.this,Lingkaran.class));
                }else if (i==6){
                    startActivity(new Intent(BangunRuang.this,BelahKetupat.class));
                }else if (i==7){
                    startActivity(new Intent(BangunRuang.this,layanglayang.class));
                }
            }

        });

    }
}