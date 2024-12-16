package com.example.compapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SearchActivity extends AppCompatActivity {
    EditText ed8;
  Button bt6,bt7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search);
        ed8=(EditText) findViewById(R.id.cd);
        bt6=(Button) findViewById(R.id.rchbtn);
        bt7=(Button) findViewById(R.id.gbtn);

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj =new Intent(getApplicationContext(), ReActivity.class);
                startActivity(obj);
            }
        });

    }
}