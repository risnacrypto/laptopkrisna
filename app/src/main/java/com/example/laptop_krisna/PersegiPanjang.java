package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {
    EditText ppanjang,plebar;
    Button pphitung;
    TextView pphasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);
        ppanjang = (EditText) findViewById(R.id.panjang);
        plebar = (EditText) findViewById(R.id.lebar);
        pphitung=(Button)findViewById(R.id.hitung2);
        pphasil=(TextView)findViewById(R.id.hasil2);

        pphitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1,bilangan2,hasil;
                bilangan1=Double.valueOf(ppanjang.getText().toString());
                bilangan2=Double.valueOf(plebar.getText().toString());

                hasil= bilangan1*bilangan2;
                String hasill =String.valueOf(hasil);
                pphasil.setText(hasill);

            }
        });
    }
}