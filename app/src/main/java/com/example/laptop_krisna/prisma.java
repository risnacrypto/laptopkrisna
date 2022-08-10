package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class prisma extends AppCompatActivity {

    EditText prla,prka,prtp;
    Button prhitung;
    TextView prhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);
        prla = (EditText) findViewById(R.id.la);
        prka = (EditText) findViewById(R.id.ka);
        prtp = (EditText) findViewById(R.id.tp);
        prhitung=(Button)findViewById(R.id.hitung13);
        prhasil=(TextView)findViewById(R.id.hasil13);

        prhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,bilangan3=0.0,hasil;
                if (prla.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Luas alas belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (prka.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Keliling alas belum di isi",
                            Toast.LENGTH_LONG).show();
                }else if (prtp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tinggi prisma tegak belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(prla.getText().toString());
                    bilangan2 = Double.valueOf(prka.getText().toString());
                    bilangan3 = Double.valueOf(prtp.getText().toString());
                    hasil = (2 * bilangan1) + (bilangan2 * bilangan3);
                    String hasill = String.valueOf(hasil);
                    prhasil.setText(hasill);
                }
            }
        });
    }
}