package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuUtama extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(new view.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, ProfileLSP.class);
                finish();
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new view.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, SkemaSertifikasi.class);
                finish();
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new view.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, Asesor.class);
                finish();
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new view.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, FlowSertifikasi.class);
                finish();
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new view.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, HasilSertifikasi.class);
                finish();
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new view.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //memb  uat method tombol keluar dari aplikasi

            }
        });
    }
}