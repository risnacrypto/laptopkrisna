package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class layanglayang extends AppCompatActivity {
    EditText llpanjang1,llpanjang2;
    Button llhitung;
    TextView llhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanglayang);

        llpanjang1= (EditText) findViewById(R.id.panjang7);
        llpanjang2= (EditText) findViewById(R.id.panjang8);
        llhitung=(Button)findViewById(R.id.hitung8);
        llhasil=(TextView)findViewById(R.id.hasil8);

        llhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,bilangan2=0.0,hasil;
                if (llpanjang1.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Panjang d1 belum di isi",
                            Toast.LENGTH_LONG).show();
                } else if (llpanjang2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Panjang d2 belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(llpanjang1.getText().toString());
                    bilangan2 = Double.valueOf(llpanjang2.getText().toString());
                    hasil = (bilangan1 * bilangan2) / 2;
                    String hasill = String.valueOf(hasil);
                    llhasil.setText(hasill);
                }
            }
        });
    }
}