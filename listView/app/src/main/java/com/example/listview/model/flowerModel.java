package com.example.listview.model;

public class flowerModel {
    private final Integer iconId;
    private final String flowerName;

    public flowerModel(Integer iconId, String flowerName) {
        this.iconId = iconId;
        this.flowerName = flowerName;
    }

    public Integer getIconId() {
        return iconId;
    }

    public String getFlowerName() {
        return flowerName;
    }
}
