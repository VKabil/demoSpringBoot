package com.example.demoSpringBoot;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RectificationService {
    //Business Logic

    public List<Rectification> rectifications = new ArrayList<>();

    public RectificationService() {
        rectifications.add(new Rectification(1, "SKEZ415625", "T20/30", "Valve leak noise", "01.07.2025"));
    }
    // Showing the total list
    public List<Rectification> getAlldetailsRectification() {
        return rectifications;
    }

    // add the new data
    public void addRectificationDetails(Rectification rectification){
        rectifications.add(rectification);
    }


    public String userDetails(){
        return "Kabil";
    }
}
