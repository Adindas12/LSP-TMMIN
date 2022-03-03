package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class FlowSertifikasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow);
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(FlowSertifikasi.this, MenuUtama.class);
        finish();
        startActivity(intent);
    }
}