package com.example.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;


public class falafel extends AppCompatActivity {
    Button btkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.falafel_layout);

        btkembali = (Button) findViewById(R.id.btkembali);

        btkembali.setOnClickListener(v -> {
            Intent intent = new Intent(falafel.this, MenuUtama.class);
            finish();
            startActivity(intent);
        });
    }
}