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

public class ReActivity extends AppCompatActivity {

Button bt2,bt3,bt8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_re);
        bt2=(Button) findViewById(R.id.addbtn);
       bt3=(Button) findViewById(R.id.srchbtn);
       bt8=(Button) findViewById(R.id.outbtn);
       bt2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent obj=new Intent(getApplication(), AddActivity.class);
               startActivity(obj);
           }
       });
       bt3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ob=new Intent(getApplicationContext(), SearchActivity.class);
               startActivity(ob);
           }
       });
       bt8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent ob=new Intent(getApplicationContext(), MainActivity.class);
               startActivity(ob);
           }
       });


    }
}