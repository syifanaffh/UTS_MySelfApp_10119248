package com.example.a10119248akbmyselfapp;
// 07 Mei - 10119248 - Syifa Nur Afifah - IF6

public class DailyModel {
    private String name;
    private String type;
    private int image;

    public DailyModel(String name, String type, int image) {
        this.name = name;
        this.type = type;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }

}
