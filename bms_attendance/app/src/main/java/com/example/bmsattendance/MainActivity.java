package com.example.bmsattendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById((R.id.button));

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), activity_success.class);
                TextView tv1 = (EditText) findViewById(R.id.editTextTextEmailAddress2);
                TextView tv2 = (EditText) findViewById(R.id.editTextTextPassword);
                String v1 = tv2.getText().toString();
                String v2 = tv2.getText().toString();
                if(v1.equals("tony@stark.com")){
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Wrong username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}