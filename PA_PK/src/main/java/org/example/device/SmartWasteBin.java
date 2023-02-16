package org.example.device;

public class SmartWasteBin extends Device{

    private boolean squeezer;

    public SmartWasteBin(String producer, String modelName,boolean squeezer, int warranty, String connectStatus) {
        super(producer, modelName, warranty, connectStatus);
        this.squeezer = squeezer;
    }

}
