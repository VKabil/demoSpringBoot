package com.example.demoSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping("/engines")
    public List<Engine> allEngineDetails(){
        return engineService.getAllEngineDetails();
    }

    @PostMapping("/engines")
    public String addEngine(@RequestBody Engine engine){
        engineService.addEngineDetails(engine);
        return "Engine Details Added Successfully";
    }
}
