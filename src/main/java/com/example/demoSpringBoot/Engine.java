package com.example.demoSpringBoot;

import java.util.Date;

public class Engine {
    private String engineNumber;
    private String engineModel;
    private String engineBlockNumber;
    private String reasonForRejection;
    private String rejectionDate;

    public Engine(String engineNumber, String engineModel, String engineBlockNumber, String reasonForRejection, String rejectionDate){
        this.engineNumber = engineNumber;
        this.engineModel = engineModel;
        this.engineBlockNumber = engineBlockNumber;
        this.reasonForRejection = reasonForRejection;
        this.rejectionDate = rejectionDate;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public String getEngineBlockNumber() {
        return engineBlockNumber;
    }

    public String getReasonForRejection() {
        return reasonForRejection;
    }
}
