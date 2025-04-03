package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.gridview.databinding.ActivityMainBinding;
import com.example.gridview.design.gridViewAdapter;
import com.example.gridview.model.arrayListModel;
import com.example.gridview.model.flowerModel;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        gridViewAdapter gridViewAdapter = new gridViewAdapter(MainActivity.this, new arrayListModel().setListData());
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        flowerModel model = (flowerModel) parent.getItemAtPosition(position);
        Toast.makeText(MainActivity.this,"Clicked by: " + model.getText(), Toast.LENGTH_SHORT).show();
    }
}