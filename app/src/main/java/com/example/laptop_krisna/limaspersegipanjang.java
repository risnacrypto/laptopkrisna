package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class limaspersegipanjang extends AppCompatActivity {

    EditText lppla,lpplst;
    Button lpphitung;
    TextView lpphasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limaspersegipanjang);
        lppla = (EditText) findViewById(R.id.la3);
        lpplst = (EditText) findViewById(R.id.lst2);
        lpphitung=(Button)findViewById(R.id.hitung15);
        lpphasil=(TextView)findViewById(R.id.hasil15);

        lpphitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (lppla.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Luas alas belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (lpplst.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Luas sisi tegak belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(lppla.getText().toString());
                    bilangan2 = Double.valueOf(lpplst.getText().toString());
                    hasil= bilangan1+(4*bilangan2);
                    String hasill =String.valueOf(hasil);
                    lpphasil.setText(hasill);
                }

            }
        });
    }
}