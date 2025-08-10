package com.example.demoSpringBoot;


// Model for fruits
public class Fruits {
    private int id;
    private String fruit_Name;
    private String fruit_weight;
    private int price;

    public Fruits(int id, String fruit_Name, String fruit_weight, int price){
        this.id = id;
        this.fruit_Name = fruit_Name;
        this.fruit_weight = fruit_weight;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getFruit_Name() {
        return fruit_Name;
    }

    public String getFruit_weight() {
        return fruit_weight;
    }

    public int getPrice() {
        return price;
    }
}
