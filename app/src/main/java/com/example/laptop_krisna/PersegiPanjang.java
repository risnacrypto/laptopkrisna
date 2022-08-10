package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (ppanjang.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Panjang belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (plebar.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Lebar belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                   else{
                        bilangan1 = Double.valueOf(ppanjang.getText().toString());
                        bilangan2 = Double.valueOf(plebar.getText().toString());
                    hasil= bilangan1*bilangan2;
                    String hasill =String.valueOf(hasil);
                    pphasil.setText(hasill);

                }

            }
        });
    }
}