package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BelahKetupat extends AppCompatActivity {
    EditText bpanjang1,bpanjang2;
    Button bhitung;
    TextView bhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);

        bpanjang1= (EditText) findViewById(R.id.panjang5);
        bpanjang2= (EditText) findViewById(R.id.panjang6);
        bhitung=(Button)findViewById(R.id.hitung7);
        bhasil=(TextView)findViewById(R.id.hasil7);

        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1,bilangan2,hasil;
                bilangan1=Double.valueOf(bpanjang1.getText().toString());
                bilangan2=Double.valueOf(bpanjang2.getText().toString());
                hasil= (bilangan1*bilangan2)/2;
                String hasill =String.valueOf(hasil);
                bhasil.setText(hasill);

            }
        });
    }
}