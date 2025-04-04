package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listview.design.listViewAdapter;
import com.example.listview.model.flowerModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<flowerModel> flowerModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);
        flowerModels = setIconAndName();
        listViewAdapter listViewAdapter = new listViewAdapter(MainActivity.this, flowerModels);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }

    private ArrayList<flowerModel> setIconAndName() {
        flowerModels = new ArrayList<>();
        flowerModels.add(new flowerModel(R.drawable.rose, "rose"));
        flowerModels.add(new flowerModel(R.drawable.sunflower, "sunflower"));
        flowerModels.add(new flowerModel(R.drawable.rose, "rose"));
        flowerModels.add(new flowerModel(R.drawable.sunflower, "sunflower"));

        return flowerModels;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        flowerModel model = flowerModels.get(position);
        Toast.makeText(MainActivity.this,"You clicked: " +model.getFlowerName(), Toast.LENGTH_SHORT).show();

    }
}