package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    TextView reg;
    EditText inputEmail, inputPassword;
    String email, password;
    Button btn_login;
    Switch active;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        inputEmail = findViewById(R.id.EmailLogin);
        inputPassword = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);
        active = findViewById(R.id.active);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ceklogin();
            }
        });
        reg = (TextView) findViewById(R.id.CreateAcc);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });
    }

    private void ceklogin() {
        email = inputEmail.getText().toString();
        password = inputPassword.getText().toString();

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_LONG).show();
                            startActivity(new Intent(MainActivity.this,MenuUtama.class));
                        } else {
                            Toast.makeText(MainActivity.this, "Login Failed, Please Check Email or Password", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}