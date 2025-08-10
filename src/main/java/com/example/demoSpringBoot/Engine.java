package com.example.demoSpringBoot;

public class Engine {

    private int id;
    private String engineNumber;
    private String model;
    private String rejectionLocation;
    private String reasonForRejection;

    public Engine(int id, String engineNumber, String model, String rejectionLocation, String reasonForRejection){
        this.id = id;
        this.engineNumber = engineNumber;
        this.model = model;
        this.rejectionLocation = rejectionLocation;
        this.reasonForRejection = reasonForRejection;
    }

    public int getId() {
        return id;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public String getModel(){
        return model;
    }

    public String getRejectionLocation() {
        return rejectionLocation;
    }

    public String getReasonForRejection() {
        return reasonForRejection;
    }
}
