package com.example.demoSpringBoot;

public class Shop {
    private String name;
    private String location;
    private String owner;

    public Shop(String name, String location, String owner){
        this.name = name;
        this.location = location;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }
}
