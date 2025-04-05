package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn, btnSubmit;
    TextView textView;
    EditText nameEdit, mobileEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnClick);
        btnSubmit = findViewById(R.id.submitBtn);
        textView = findViewById(R.id.textView);
        nameEdit = findViewById(R.id.nameEdit);
        mobileEdit = findViewById(R.id.mobileEdit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);

                Fragment fragment = new FirstFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container, fragment).commit();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sentDatatoFragment();
            }
        });
    }

    private void sentDatatoFragment() {
        String name, mobile = "";

        name = nameEdit.getText().toString();
        mobile = mobileEdit.getText().toString();

        Fragment frag = new DataFragment();

        Bundle bundle = new Bundle();
        bundle.putString("username",name);
        bundle.putString("usermobile",mobile);

        frag.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container,frag).commit();
    }
}