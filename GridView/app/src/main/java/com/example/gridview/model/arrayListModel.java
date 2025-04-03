package com.example.gridview.model;

import com.example.gridview.R;

import java.util.ArrayList;

public class arrayListModel {
    public ArrayList<flowerModel> setListData() {

        ArrayList<flowerModel> arrayList = new ArrayList<>();

        arrayList.add(new flowerModel(R.drawable.rose, "rose"));
        arrayList.add(new flowerModel(R.drawable.sunflower, "sunflower"));
        arrayList.add(new flowerModel(R.drawable.rose, "rose"));
        arrayList.add(new flowerModel(R.drawable.sunflower, "sunflower"));

        return arrayList;
    }

}
