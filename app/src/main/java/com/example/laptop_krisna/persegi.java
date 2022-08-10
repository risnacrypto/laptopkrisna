package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegi extends AppCompatActivity {

    EditText psisi;
    Button phitung;
    TextView phasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        psisi = (EditText) findViewById(R.id.sisi);
        phitung=(Button)findViewById(R.id.hitung);
        phasil=(TextView)findViewById(R.id.hasil);

        phitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                double bilangan1=0.0,hasil;

                if (psisi.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Sisi belum di isi",
                            Toast.LENGTH_LONG).show();
                } else {
                    bilangan1=Double.valueOf(psisi.getText().toString());
                    hasil= bilangan1*bilangan1;
                    String hasill =String.valueOf(hasil);
                    phasil.setText(hasill);

                }

            }
        });
    }
}