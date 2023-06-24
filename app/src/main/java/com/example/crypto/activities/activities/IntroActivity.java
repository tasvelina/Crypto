package com.example.crypto.activities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.crypto.R;

public class IntroActivity extends AppCompatActivity {
    private ImageView runBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        initview();
        setVariable();
    }

    private void initview() {
        runBtn=findViewById(R.id.runBtn);
    }

    private void setVariable(){
        runBtn.setOnClickListener(view -> startActivity(new Intent(IntroActivity.this, LoginActivity.class)));
    }

}
