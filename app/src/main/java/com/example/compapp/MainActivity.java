package com.example.compapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 EditText ed1,ed2;
 Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.uname);
        ed2 = (EditText) findViewById(R.id.pass);
        bt1 = (Button) findViewById(R.id.lobutton);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = ed1.getText().toString().trim();
                String s2 = ed2.getText().toString().trim();
                if (s1.equals("admin") && s2.equals("1234")) {
                    Intent obj = new Intent(getApplicationContext(), ReActivity.class);
                    startActivity(obj);
                } else {
                    Toast.makeText(getApplicationContext(), "INVALID CREDENTIALS", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    }