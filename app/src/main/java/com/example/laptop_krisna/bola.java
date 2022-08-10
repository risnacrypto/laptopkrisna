package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bola extends AppCompatActivity {
    EditText bojari;
    Button bohitung;
    TextView bohasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);
        bojari= (EditText) findViewById(R.id.jari3);
        bohitung=(Button)findViewById(R.id.hitung17);
        bohasil=(TextView)findViewById(R.id.hasil17);

        bohitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bilangan1=0.0,hasil;
                if (bojari.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "Jari-jari belum di isi",
                            Toast.LENGTH_LONG).show();
                }
                else {
                    bilangan1 = Double.valueOf(bojari.getText().toString());
                    hasil= 4*3.14*bilangan1*bilangan1;
                    String hasill =String.valueOf(hasil);
                    bohasil.setText(hasill);

                }


            }
        });
    }
}