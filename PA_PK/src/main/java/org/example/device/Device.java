package org.example.device;

import java.util.UUID;

public class Device {

    private String modelName;
    private String producer;
    private UUID serialNumber;
    private int warranty;
    private String connectStatus;

    public Device(String producer,String modelName,int warranty,String connectStatus){
        this.producer = producer;
        this.modelName = modelName;
        this.warranty = warranty;
        this.connectStatus = connectStatus;
        this.serialNumber = UUID.randomUUID();


    }

    public String getConnectStatus(){
        return this.connectStatus;
    }

    public void changeStatusToConnect(){
        this.connectStatus = "Connected";
    }

    public void changeStatusToError(){
        this.connectStatus = "Error";
    }
    public String getProducer(){
        return this.producer;
    }


}
