package com.example.gridview.model;

public class flowerModel {
    private final Integer iconId;
    private final String text;

    public flowerModel(Integer iconId, String text) {
        this.iconId = iconId;
        this.text = text;
    }

    public Integer getIconId() {
        return iconId;
    }

    public String getText() {
        return text;
    }
}
