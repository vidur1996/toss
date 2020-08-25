package com.example.qr_generator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class exit extends AppCompatActivity {
TextView dataview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);


        dataview = findViewById(R.id.dataview);
        Intent intent2 = getIntent();
        String data1 = intent2.getStringExtra("scandata");
        dataview.setText(data1);
    }
}
