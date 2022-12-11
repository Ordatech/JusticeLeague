package com.example.justiceleague;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView heroPName, heroNName, heroDes;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = findViewById(R.id.imageView);
        heroNName = findViewById(R.id.heroNName_SecActivity);
        heroPName = findViewById(R.id.heroPName_SecActivity);
        heroDes = findViewById(R.id.heroDes_SecActivty);

        heroPName.setText(getIntent().getExtras().getString("heroPName"));
        heroNName.setText(getIntent().getExtras().getString("heroNName"));
        heroDes.setText(getIntent().getExtras().getString("heroDes"));
        imageView.setImageResource(getIntent().getIntExtra("imageView", 0));


    }
}