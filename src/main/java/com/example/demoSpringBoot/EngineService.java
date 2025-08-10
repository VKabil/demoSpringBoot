package com.example.demoSpringBoot;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EngineService {
    //Business Logic

    public List<Engine> engines = new ArrayList<>();

    public EngineService(){
        engines.add(new Engine(1, "SJEZ410100", "T20/60", "C-Zone", "Need to be wiring harness routing"));
    }

    public List<Engine> getAllEngineDetails(){
        return engines;
    }

    public void addEngineDetails(Engine engine){
        engines.add(engine);
    }
}
