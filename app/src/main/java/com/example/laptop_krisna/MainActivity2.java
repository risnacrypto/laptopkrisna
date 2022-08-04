package com.example.laptop_krisna;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn;
        Button btn2;


        btn = findViewById(R.id.buttonGGGAMING);
        btn2 = findViewById(R.id.Next1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String value ="hello world";
                Intent intent = new Intent (MainActivity2.this, MainActivity3.class);
                intent.putExtra("key", value);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                Toast.makeText(getApplicationContext(), "MING WAS HERE",
                        Toast.LENGTH_LONG).show();
            }
        });



    }
}