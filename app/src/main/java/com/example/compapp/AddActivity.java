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

public class AddActivity extends AppCompatActivity {
    EditText ed3,ed4,ed5,ed6,ed7;
Button bt4,bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
  ed3=(EditText) findViewById(R.id.ecode);
  ed4=(EditText) findViewById(R.id.ename);
  ed5=(EditText) findViewById(R.id.edes);
  ed6=(EditText) findViewById(R.id.mail);
  ed4=(EditText) findViewById(R.id.sal);
  bt4=(Button) findViewById(R.id.sbtn);
  bt5=(Button) findViewById(R.id.logbtn);

  bt5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          Intent ob= new Intent(getApplicationContext(), ReActivity.class);
           startActivity(ob);
      }
  });
    }
}