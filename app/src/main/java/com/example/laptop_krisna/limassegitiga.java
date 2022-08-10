package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class limassegitiga extends AppCompatActivity {

    EditText lsla,lslst;
    Button lshitung;
    TextView lshasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limassegitiga);
        lsla = (EditText) findViewById(R.id.la4);
        lslst = (EditText) findViewById(R.id.lst3);
        lshitung=(Button)findViewById(R.id.hitung16);
        lshasil=(TextView)findViewById(R.id.hasil16);

        lshitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (lsla.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Luas alas belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (lslst.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Luas sisi tegak belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(lsla.getText().toString());
                    bilangan2 = Double.valueOf(lslst.getText().toString());
                    hasil= bilangan1+(3*bilangan2);
                    String hasill =String.valueOf(hasil);
                    lshasil.setText(hasill);
                }


            }
        });
    }
}