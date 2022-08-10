package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class balok extends AppCompatActivity {

    EditText bpanjang,blebar,btinggi;
    Button bhitung;
    TextView bhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        bpanjang = (EditText) findViewById(R.id.panjang9);
        blebar = (EditText) findViewById(R.id.lebar2);
        btinggi = (EditText) findViewById(R.id.tinggi4);
        bhitung=(Button)findViewById(R.id.hitung10);
        bhasil=(TextView)findViewById(R.id.hasil10);

        bhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,bilangan3=0.0,hasil;
                if (bpanjang.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Panjang belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (blebar.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "lebar belum di isi",
                            Toast.LENGTH_LONG).show();
                }else if (btinggi.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Tinggi belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(bpanjang.getText().toString());
                    bilangan2 = Double.valueOf(blebar.getText().toString());
                    bilangan3 = Double.valueOf(btinggi.getText().toString());
                    hasil= 2*(bilangan1*bilangan2+bilangan1*bilangan3+bilangan2*bilangan3);
                    String hasill =String.valueOf(hasil);
                    bhasil.setText(hasill);
                }

            }
        });
    }
}