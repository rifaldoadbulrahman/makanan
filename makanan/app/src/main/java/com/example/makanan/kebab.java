package com.example.makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class kebab extends AppCompatActivity {
    Button btkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kebab_layout);

        btkembali = (Button) findViewById(R.id.btkembali);

        btkembali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kebab.this, MenuUtama.class);
                finish();
                startActivity(intent);
            }
        });
    }
}