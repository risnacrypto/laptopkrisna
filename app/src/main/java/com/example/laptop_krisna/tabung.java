package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class tabung extends AppCompatActivity {

    EditText tatinggi,tajari;
    Button tahitung;
    TextView tahasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        tatinggi = (EditText) findViewById(R.id.tinggi5);
        tajari = (EditText) findViewById(R.id.jari2);
        tahitung=(Button)findViewById(R.id.hitung11);
        tahasil=(TextView)findViewById(R.id.hasil11);

        tahitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (tatinggi.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Tinggi belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (tajari.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Jari belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(tatinggi.getText().toString());
                    bilangan2 = Double.valueOf(tajari.getText().toString());
                    hasil= (2*3.14*bilangan1*bilangan2)+(3.14*bilangan2*bilangan2);
                    String hasill =String.valueOf(hasil);
                    tahasil.setText(hasill);
                }

            }
        });
    }
}