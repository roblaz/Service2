package com.example.service2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static Random rand = new Random();

    Intent intent;
    MyService service;
    TextView click, send;
    ConstraintLayout constraintLayout;
    String dataNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = findViewById(R.id.tv_click);
        send = findViewById(R.id.tv_send);
        constraintLayout = findViewById(R.id.constrain);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void onClick(View view) {
        constraintLayout.setBackgroundColor(getColor());
    }

    public void onSend(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);

    }

    private int getColor() {
        return Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }


}
