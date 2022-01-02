package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("deprecation")
public class FlowSertifikasi  extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow);

        listView = findViewById(R.id.list);
        String[] values = new String[]{"Flow Sertifikasi"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
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
}