package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //세가지 음료 배열
    public static final Drink[] drinks = {
            new Drink ("라떼","따뜻한우유와에스프레소샷2개", R.drawable.latte),
            new Drink ("카푸치노","따뜻한콜라와에스프레소샷3개", R.drawable.cappuccino),
            new Drink ("필터","따뜻한홍차와에스프레소샷5개", R.drawable.filter),
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
