package com.example.demoSpringBoot;

public class Associate {
    private String name;
    private String role;
    private String shop;
    private int salary;

    public Associate(String name, String role, String shop, int salary) {
        this.name = name;
        this.role = role;
        this.shop = shop;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getShop() {
        return shop;
    }

    public int getSalary() {
        return salary;
    }
}
