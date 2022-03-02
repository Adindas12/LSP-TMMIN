package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("ALL")
public class SkemaSertifikasi extends AppCompatActivity {
    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skema);

        listView = findViewById(R.id.list);
        String[] values = new String[]{"Skema Press","Skema Welding","Skema Painting","Skema Assembly","Skema Logistic","Skema Maintenance"};

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((AdapterView.OnItemClickListener) (parent, view, position, id) -> {
            if (position == 0) {
                Intent myIntent = new Intent(view.getContext(), SkemaPress.class);
                startActivityForResult(myIntent, 0);
            }

            if (position == 1) {
                Intent myIntent = new Intent(view.getContext(), SkemaWelding.class);
                startActivityForResult(myIntent, 0);
            }

            if (position == 2) {
                Intent myIntent = new Intent(view.getContext(), SkemaToso.class);
                startActivityForResult(myIntent, 0);
            }

            if (position == 3) {
                Intent myIntent = new Intent(view.getContext(), SkemaAssy.class);
                startActivityForResult(myIntent, 0);
            }

            if (position == 4) {
                Intent myIntent = new Intent(view.getContext(), SkemaLogistic.class);
                startActivityForResult(myIntent, 0);
            }

            if (position == 5) {
                Intent myIntent = new Intent(view.getContext(), SkemaMaintenance.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(SkemaSertifikasi.this, MenuUtama.class);
        finish();
        startActivity(intent);
    }
}
