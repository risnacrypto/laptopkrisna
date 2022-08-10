package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kubus extends AppCompatActivity {
    EditText ksisi;
    Button khitung;
    TextView khasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        ksisi = (EditText) findViewById(R.id.sisi3);
        khitung=(Button)findViewById(R.id.hitung9);
        khasil=(TextView)findViewById(R.id.hasil9);

        khitung.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double bilangan1=0.0,hasil;
            if (ksisi.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(), "Sisi belum di isi",
                        Toast.LENGTH_LONG).show();
            }
            else {
                bilangan1 = Double.valueOf(ksisi.getText().toString());
                hasil= 6*bilangan1*bilangan1;
                String hasill =String.valueOf(hasil);
                khasil.setText(hasill);
            }

        }
        });
    }
}