package com.example.recyclerview.model;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class flowerModel {

    public ArrayList<recyclerViewArrayList> setListOfArrayItems() {

        ArrayList<recyclerViewArrayList> recyclerViewArrayLists = new ArrayList<>();

        recyclerViewArrayLists.add(new recyclerViewArrayList(R.drawable.rose,"rose"));
        recyclerViewArrayLists.add(new recyclerViewArrayList(R.drawable.sunflower,"sunflower"));
        recyclerViewArrayLists.add(new recyclerViewArrayList(R.drawable.rose,"rose"));
        recyclerViewArrayLists.add(new recyclerViewArrayList(R.drawable.sunflower,"sunflower"));
        recyclerViewArrayLists.add(new recyclerViewArrayList(R.drawable.rose,"rose"));
        recyclerViewArrayLists.add(new recyclerViewArrayList(R.drawable.sunflower,"sunflower"));

        return recyclerViewArrayLists;
    }

}
