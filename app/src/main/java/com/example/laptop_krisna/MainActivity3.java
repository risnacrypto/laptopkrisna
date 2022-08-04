package com.example.laptop_krisna;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    String kata= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        RadioGroup radioGroup;
        RadioButton java,kotilin,cPlus;
        TextView textview,textv,texts;
        Button button;
        Button btn2;


        String value = getIntent().getStringExtra("key");



        radioGroup = findViewById(R.id.RadioGroup);
        java= findViewById(R.id.radioButtonJava);
        kotilin= findViewById(R.id.radioButtonKotilin);
        cPlus= findViewById(R.id.radioButtonCPlus);

        textview= findViewById(R.id.TextViewHasilPilihan);
        textv= findViewById(R.id.textViewRadioButton);
        texts= findViewById(R.id.textmuncul);

        texts.setText(value);

        button=findViewById(R.id.buttonRadioSubmit) ;
        btn2 = findViewById(R.id.Next2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent (MainActivity3.this, MainActivity2.class);
                startActivity (intent);
            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
        @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
            switch (id){
                case R.id.radioButtonJava:
                    Toast.makeText(getApplication(), "Saya Suka Java", Toast.LENGTH_SHORT).show();
                    kata="Saya Suka Java";
                    break;
                case R.id.radioButtonKotilin:
                    Toast.makeText(getApplication(), "Saya Suka Kotilin", Toast.LENGTH_SHORT).show();
                    kata="Saya Suka Kotilin";
                    break;
                case R.id.radioButtonCPlus:
                    Toast.makeText(getApplication(), "Saya Suka c++", Toast.LENGTH_SHORT).show();
                    kata="Saya Suka c++";
                    break;
            }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                textview.setText(kata);
            }
        });

    }
}