package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Trapesium extends AppCompatActivity {
    EditText tpa,tpb,ttinggi;
    Button thitung;
    TextView thasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        tpa= (EditText) findViewById(R.id.panjang3);
        tpb= (EditText) findViewById(R.id.panjang4);
        ttinggi = (EditText) findViewById(R.id.tinggi3);
        thitung=(Button)findViewById(R.id.hitung5);
        thasil=(TextView)findViewById(R.id.hasil5);

        thitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,bilangan3=0.0,hasil;
                if (tpa.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Panjang alas atas belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (tpb.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Panjang alas bawah belum di isi",
                            Toast.LENGTH_LONG).show();
                }else if (ttinggi.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tinggi belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(tpa.getText().toString());
                    bilangan2 = Double.valueOf(tpb.getText().toString());
                    bilangan3 = Double.valueOf(ttinggi.getText().toString());
                    hasil= (bilangan1+bilangan2)/2*bilangan3;
                    String hasill =String.valueOf(hasil);
                    thasil.setText(hasill);
                }

            }
        });
    }
}