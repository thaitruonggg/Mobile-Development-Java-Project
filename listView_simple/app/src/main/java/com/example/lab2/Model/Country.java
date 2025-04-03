package com.example.lab2.Model;

public class Country {
    private String name;
    private String currency;
    private String flag;

    public Country(String name, String currency, String flag) {
        this.name = name;
        this.currency = currency;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }



}
