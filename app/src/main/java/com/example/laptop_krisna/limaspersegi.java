package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class limaspersegi extends AppCompatActivity {

    EditText lpla,lplst;
    Button lphitung;
    TextView lphasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limaspersegi);
        lpla = (EditText) findViewById(R.id.la2);
        lplst = (EditText) findViewById(R.id.lst);
        lphitung=(Button)findViewById(R.id.hitung14);
        lphasil=(TextView)findViewById(R.id.hasil14);

        lphitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (lpla.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Luas alas belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (lplst.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Luas sisi tegak belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(lpla.getText().toString());
                    bilangan2 = Double.valueOf(lplst.getText().toString());
                    hasil = bilangan1 + (4 * bilangan2);
                    String hasill = String.valueOf(hasil);
                    lphasil.setText(hasill);
                }


            }
        });
    }
}