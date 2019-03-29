package com.example.studyroomsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText idTxt = (EditText)findViewById(R.id.idTxt);
        EditText pwdTxt = (EditText)findViewById(R.id.pwdTxt);

        Button loginBt = (Button)findViewById(R.id.loginBt);

        TextView registerBt = (TextView)findViewById(R.id.registerBt);
        registerBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this. RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
