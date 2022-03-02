package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HasilSertifikasi extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_sertifikasi);
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(HasilSertifikasi.this, MenuUtama.class);
        finish();
        startActivity(intent);
    }
}