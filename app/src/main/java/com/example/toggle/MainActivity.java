package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tlight, tdark;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnBtnClick();
    }

    public void addListenerOnBtnClick(){
        tlight = (ToggleButton) findViewById(R.id.togglelight);
        tdark = (ToggleButton) findViewById((R.id.toggledark));
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res;
                res = "Button 1: "+tlight.getText() + "\nButton 2:" + tdark.getText();
                Toast.makeText(getApplicationContext(), res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}