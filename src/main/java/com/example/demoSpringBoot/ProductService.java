package com.example.demoSpringBoot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {


    public List<Product> getAllProduct(){
        return Arrays.asList(
                new Product("Samsung", "M35", 18759),
                new Product("Motorola", "G50", 21499)
        );
    }

//    public String addProduct(Product product){
//        return "Hello";
//    }
}
