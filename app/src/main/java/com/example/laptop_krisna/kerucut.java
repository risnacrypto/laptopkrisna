package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kerucut extends AppCompatActivity {

    EditText kejari,kegp;
    Button kehitung;
    TextView kehasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);
        kejari = (EditText) findViewById(R.id.jari4);
        kegp= (EditText) findViewById(R.id.gp);
        kehitung=(Button)findViewById(R.id.hitung12);
        kehasil=(TextView)findViewById(R.id.hasil12);

        kehitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (kejari.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Jari-jari belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (kegp.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Garis pelukis belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(kejari.getText().toString());
                    bilangan2 = Double.valueOf(kegp.getText().toString());
                    hasil= 3.14*bilangan1*bilangan2+3.14*bilangan1*bilangan1;
                    String hasill =String.valueOf(hasil);
                    kehasil.setText(hasill);
                }
            }
        });
    }
}