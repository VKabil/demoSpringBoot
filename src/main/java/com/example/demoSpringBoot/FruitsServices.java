package com.example.demoSpringBoot;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FruitsServices {

    // Business Logic services

    public List<Fruits> fruits = new ArrayList<>();

    public FruitsServices(){
        fruits.add(new Fruits(1, "Banana", "5KG", 560));
        fruits.add(new Fruits(2, "Apple", "6KG", 1250));
    }

    public List<Fruits> getAllFruits(){
        return fruits;
    }

    public String addNewFruits(Fruits fruit){
        if(fruit.getFruit_Name() == null || fruit.getFruit_weight() == null){
            return "Error: fruit_name & fruit_weight can't be empty";
        }
        fruits.add(fruit);
        return "Fruit"+ fruit.getFruit_Name() +"added successfully";
    }

    public Fruits getFruitById(int id){
        for(Fruits fruits1 : fruits){
            if(fruits1.getId() == id){
                return fruits1;
            }
        }
        return null;
    }

    public boolean deleteFruitById(int id){
        return fruits.removeIf(fruits1 -> fruits1.getId() == id);
    }

    public boolean updateFruit(int id, Fruits updateFruit){
        for(int i=0; i<fruits.size(); i++){
            if(fruits.get(i).getId() == id){
                fruits.set(i, updateFruit);
                return true;
            }
        }
        return false;
    }
}
