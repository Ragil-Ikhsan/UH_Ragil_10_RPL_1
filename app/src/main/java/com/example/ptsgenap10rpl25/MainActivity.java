package com.example.ptsgenap10rpl25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ptsgenap10rpl25.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonlogin = findViewById(R.id.buttonLogin);
        getSupportActionBar().hide();

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                login();
            }
        });
    }


    void login(){
        EditText emailLogin = (EditText)findViewById(R.id.EmailAddress);
        EditText passwordLogin = (EditText)findViewById(R.id.TextPassword);

        String emailVer = "ragilikhsan27@gmail.com";
        String passwordVer = "ragilikhsan27";

        String emailLog = emailLogin.getText().toString();
        String passwordLog = passwordLogin.getText().toString();

        if (emailLog.equals(emailVer) && passwordLog.equals(passwordVer)) {
            Toast.makeText(this, "Anda Masuk", Toast.LENGTH_SHORT).show();


        }else {
            Toast.makeText(this, "email atau password salah", Toast.LENGTH_SHORT).show();
        }

    }
}