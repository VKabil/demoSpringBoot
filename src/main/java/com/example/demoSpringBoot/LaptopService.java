package com.example.demoSpringBoot;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LaptopService {
    //Business Logic

    public List<Laptop> getAllLaptop(){
        return Arrays.asList(
                new Laptop(1234, "Dell"),
                new Laptop(5467, "Apple")
        );
    }
}
