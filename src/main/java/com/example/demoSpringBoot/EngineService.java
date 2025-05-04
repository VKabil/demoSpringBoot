package com.example.demoSpringBoot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EngineService {

    private List<Engine> engines = new ArrayList<>();

    public EngineService(){
        engines.add(new Engine("SMEZ410256", "3UNE/61", "ES12365", "Idel Hunting", "02.05.2025"));
        engines.add(new Engine("SMEZ410257","T20/28", "ES56987", "Excess Smoke", "28.04.2025"));
    }

    public List<Engine> getAllEngineDetails(){
        return engines;
    }

    public void addEngines(Engine engine){
        engines.add(engine);
    }
}
