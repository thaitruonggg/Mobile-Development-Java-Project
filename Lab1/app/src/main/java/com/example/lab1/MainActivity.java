package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mButtonTrue;
    private Button mButtonFalse;
    private Button mButtonNext;
    private Button mButtonPrevious;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTrue = (Button) findViewById(R.id.btnTrue);
        mButtonFalse = (Button) findViewById(R.id.btnFalse);
        mButtonNext = (Button) findViewById(R.id.btnNext);
        mButtonPrevious = (Button) findViewById(R.id.btnPrevious);

        mButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
            }
        });

        mButtonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
            }
        });
    }



}