package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HasilSertifikasi extends AppCompatActivity {
    Button btkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_sertifikasi);

        btkembali = findViewById(R.id.btkembali);

        btkembali.setOnClickListener(v -> {
            Intent intent = new Intent(HasilSertifikasi.this, MenuUtama.class);
            finish();
            startActivity(intent);
        });
    }
}