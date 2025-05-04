package com.example.demoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.*;



@RestController
public class StudentController {


    @Autowired
    private ProductService productService;



    @GetMapping("/message")
    public int welcomeMessage() {
        int a= 10;
        int b=20;
        return a+b;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return Arrays.asList(
                new User(12, "Bharath", "bharath@123.com"),
                new User(67, "Senthil", "senthil@123.com")
        );
    }



    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProduct();
    }

    @PostMapping("/products")
    public String getAllProduct(@RequestBody Product product){
        if(product.getMobileBrand() == null || product.getModel()== null || product.getMobileBrand().isEmpty() || product.getModel().isEmpty()){
            return "Error: MobileBrand and Model can't be empty";
        }

        productService.addProduct(product);
        return "Product "+ product.getMobileBrand() + " added successfully";
    }

    @Autowired
    private EngineService engineService;

    @GetMapping("/engines")
    public List<Engine> getEngines(){
        return engineService.getAllEngineDetails();
    }

    @PostMapping("/engines")
    public String addEngines(@RequestBody Engine engine){
        engineService.addEngines(engine);
        return "Engine added Successfully";
    }


}
