package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class  JajarGenjang extends AppCompatActivity {
    EditText jalas,jtinggi;
    Button jhitung;
    TextView jhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        jalas = (EditText) findViewById(R.id.alas);
        jtinggi = (EditText) findViewById(R.id.tinggi2);
        jhitung=(Button)findViewById(R.id.hitung4);
        jhasil=(TextView)findViewById(R.id.hasil4);

        jhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1,bilangan2,hasil;
                bilangan1=Double.valueOf(jalas.getText().toString());
                bilangan2=Double.valueOf(jtinggi.getText().toString());

                hasil= bilangan1*bilangan2;
                String hasill =String.valueOf(hasil);
                jhasil.setText(hasill);

            }
        });
    }
}