package com.example.demoSpringBoot;

public class Product {
    private String mobileBrand;
    private String model;
    private int price;

    public Product(String mobileBrand, String model, int price){
        this.mobileBrand = mobileBrand;
        this.model = model;
        this.price = price;
    }

    public String getMobileBrand() {
        return mobileBrand;
    }

    public void setMobileBrand(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
