package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText spanjang,stinggi;
    Button shitung;
    TextView shasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        spanjang = (EditText) findViewById(R.id.panjang2);
        stinggi = (EditText) findViewById(R.id.tinggi);
        shitung=(Button)findViewById(R.id.hitung3);
        shasil=(TextView)findViewById(R.id.hasil3);

        shitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1,bilangan2,hasil;
                bilangan1=Double.valueOf(spanjang.getText().toString());
                bilangan2=Double.valueOf(stinggi.getText().toString());

                hasil= (bilangan1*bilangan2)/2;
                String hasill =String.valueOf(hasil);
                shasil.setText(hasill);

            }
        });
    }
}