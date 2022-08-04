package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KalkulatorLuas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_luas);

        Button btn;
        Button btn2;

        btn = findViewById(R.id.Bdatar);
        btn2 = findViewById(R.id.Bruang);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorLuas.this, BangunDatar.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KalkulatorLuas.this, BangunRuang.class);
                startActivity(intent);
            }
        });
    }
}