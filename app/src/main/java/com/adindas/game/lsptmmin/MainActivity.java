package com.adindas.game.lsptmmin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText username,
            password;
    private Button login;
    Switch active;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contentView(R.layout.activity_main);
        contentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        active = findViewById(R.id.active);

        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(new view.OnClickListener(){
            @Override
            public void onClick(View v) {
                DatabaseReference databaseRefer= FirebaseDatabase.getInstance().getReference();
                DatabaseReference.child("login");
                DatabaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String input1 = username.getText().toString();
                        String input2 = password.getText().toString();

                        if (dataSnapshot.child(input1).exists() ) {
                            if (dataSnapshot.child(input2).exists()){
                                if (active.isChecked()) {
                                    if (dataSnapshot.child("as").equals("admin")){
                                        preferences.setDataLogin(MainActivity.this,true);
                                        preferences.setDataAs(MainActivity.this,"admin");

                                    } else {
                                        preferences.setDataLogin(MainActivity.this,true);
                                        preferences.setDataAs(MainActivity.this,"user");

                                    }
                                } else{
                                    if (dataSnapshot.child("as").equals("admin")){
                                        preferences.setDataLogin(MainActivity.this,false);

                                    } else {
                                        preferences.setDataLogin(MainActivity.this,false);

                                    }
                                }

                            } else {
                                Toast.makeText(MainActivity.this, "Kata sandi salah", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "Data belum terdaftar", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }

    private void contentView(int activity_main) {
    }
}