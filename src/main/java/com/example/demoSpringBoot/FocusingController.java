package com.example.demoSpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;




@RestController
public class FocusingController {

    @Autowired
    private RectificationService rectificationService;

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/selling")
    public String Selling() {
        return "I sell to the car";
    }

    @GetMapping("/rectification")
    public List<Rectification> getAlldetailsRectification() {
        return rectificationService.getAlldetailsRectification();
    }

    @PostMapping("/rectification")
    public String addRectificationDetails(@RequestBody Rectification rectification){
        rectificationService.addRectificationDetails(rectification);
        return "Rectification Details added Successfully";
    }

    @GetMapping("/userss")
    public String getName(){
        return rectificationService.userDetails();
    }


    @GetMapping("/laptop")
    public List<Laptop> getlap(){
        return laptopService.getAllLaptop();
    }



}
