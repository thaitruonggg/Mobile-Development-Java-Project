package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lab2.Controller.CountryAdapter;
import com.example.lab2.Model.Country;

public class MainActivity extends AppCompatActivity {

    private Country[] countries = new Country[] {
            new Country("Albania", "Lek", "albania"),
            new Country("Afghanistan", "Afghani", "afghanistan")
    };

    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.main_listview);
        //ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        CountryAdapter mAdapter = new CountryAdapter(this, R.layout.custom_item, countries);
        mListView.setAdapter(mAdapter);
    }

}