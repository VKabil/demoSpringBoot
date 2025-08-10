package com.example.demoSpringBoot;

public class Laptop {
    private int id;
    private String brand;

    public Laptop(int id, String brand){
        this.id = id;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
}
