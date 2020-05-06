package com.example.appgooglefirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textWelcome = findViewById(R.id.textWelcome);

        String nome = getIntent().getStringExtra("NAME");

        textWelcome.setText("Bem-vindo, "+nome);
    }
}
