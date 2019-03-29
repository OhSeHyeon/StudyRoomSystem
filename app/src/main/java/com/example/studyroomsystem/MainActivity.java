package com.example.studyroomsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText idTxt = (EditText)findViewById(R.id.idTxt);
        EditText pwdTxt = (EditText)findViewById(R.id.pwdTxt);

        TextView welcomeMsg = (TextView) findViewById(R.id.welcomeMsg);
        TextView registeButton = (TextView) findViewById(R.id.registerBt);
    }
}
