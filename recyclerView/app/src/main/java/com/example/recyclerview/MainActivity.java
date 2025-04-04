package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.design.recyclerViewAdapter;
import com.example.recyclerview.model.flowerModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter adapter = new recyclerViewAdapter(this,new flowerModel().setListOfArrayItems());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
}