package com.example.demoSpringBoot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ShopService {
    public List<Shop> shops = new ArrayList<>();

    public ShopService(){
        shops.add(new Shop("boot", "Arumbakkam", "janny"));
        shops.add(new Shop("Revathi store", "Thirumangalam", "vagora"));
    }

    public List<Shop> getAllShops(){
        return shops;
    }

    public String addShop(Shop shop){
        if(shop.getName().isEmpty() || shop.getOwner().isEmpty()){
            return "Error: Name and owner name can't be empty";
        }
        shops.add(shop);
        return shop.getOwner()+" Shop added successfully";
    }
}
