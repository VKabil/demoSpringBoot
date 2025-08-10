package com.example.demoSpringBoot;

public class Rectification {
    private int id;
    private String engineNumber;
    private String engineModel;
    private String reason;
    private String date;

    public Rectification(int id, String engineNumber, String engineModel, String reason, String date){
        this.id = id;
        this.engineNumber = engineNumber;
        this.engineModel = engineModel;
        this.reason = reason;
        this.date = date;
    }

    // Getters need for Json output
    public int getId() {
        return id;
    }

    // Getters need for Json output
    public String getEngineNumber() {
        return engineNumber;
    }

    // Getters need for Json output
    public String getEngineModel() {
        return engineModel;
    }

    // Getters need for Json output
    public String getReason() {
        return reason;
    }

    public String getDate() {
        return date;
    }
}
