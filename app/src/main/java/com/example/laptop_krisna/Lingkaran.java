package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    EditText ljari;
    Button lhitung;
    TextView lhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        ljari= (EditText) findViewById(R.id.jari);
        lhitung=(Button)findViewById(R.id.hitung6);
        lhasil=(TextView)findViewById(R.id.hasil6);

        lhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1,hasil;
                bilangan1=Double.valueOf(ljari.getText().toString());
                hasil= (bilangan1*bilangan1)*3.14;
                String hasill =String.valueOf(hasil);
                lhasil.setText(hasill);

            }
        });
    }
}