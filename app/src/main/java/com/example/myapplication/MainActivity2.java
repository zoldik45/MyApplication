package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b = findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainHANDSActivity.class);
                startActivity(i);
            }
        });
        Button c = findViewById(R.id.button2);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainPRESSActivity.class);
                startActivity(i);
            }
        });
        Button d = findViewById(R.id.button3);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainLEGSActivity.class);
                startActivity(i);
            }
        });
    }
}