package com.example.demoSpringBoot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> products = new ArrayList<>();

    public ProductService(){
        products.add(new Product("Samsung", "M35", 19899));
        products.add(new Product("Apple", "16pro", 58956));
    }

    public List<Product> getAllProduct(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
