package com.adindas.game.lsptmmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    TextView log;
    EditText inputEmail, pass1, pass2;
    String email, password1, password2;
    Button btn_Regist;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        log = (TextView) findViewById(R.id.HaveAcc);
        log.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,MainActivity.class));
            }
        });

        inputEmail = findViewById(R.id.EmailRegist);
        pass1 = findViewById(R.id.PassRegist);
        pass2 = findViewById(R.id.PassRegist2);
        btn_Regist = findViewById(R.id.btn_regist);
        btn_Regist.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register() {
        email = inputEmail.getText().toString();
        password1 = pass1.getText().toString();
        password2 = pass2.getText().toString();

        mAuth.createUserWithEmailAndPassword(email, password2)
                .addOnCompleteListener(this, new  OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(RegisterActivity.this, "Regist Success",Toast.LENGTH_LONG).show();
                            startActivity(new Intent(RegisterActivity.this,MainActivity.class));
                        } else {
                            Toast.makeText(RegisterActivity.this, "Regist Failed",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}