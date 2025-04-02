package com.example.challenge1;

/** Now, let's test our knowledge in coding. I'll
 give you a coding challenge, and you need
 to solve it your own.
 1- Create a new app
 2- Create 2 buttons
 3- When the user clicks the first button,
 a toast msg will be displayed saying:
 "Hello from Master Android App"
 4- The second button, will change the
 background color of the main layout **/

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonToast;
    private Button buttonChangeBGColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = (Button) findViewById(R.id.button1);
        buttonChangeBGColor = (Button) findViewById(R.id.button2);
        ConstraintLayout mainLayout = findViewById(R.id.mainLayout);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello from Master Android App", Toast.LENGTH_SHORT).show();
            }
        });

        buttonChangeBGColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainLayout.setBackgroundColor(Color.BLACK);
            }
        });
    }
}