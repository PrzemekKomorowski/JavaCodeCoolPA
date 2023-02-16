package org.example;

import org.example.device.Device;

import java.util.ArrayList;

public class Gateway {
    private String producer;
    private ArrayList<Device> connectedDevices = new ArrayList<>();
    private ArrayList<Device> errorDevices = new ArrayList<>();
    private String address;

    public Gateway(String producer,String address){
        this.producer = producer;
        this.address = address;
    }




    public ArrayList<Device> getDevicesList(){
        ArrayList<Device> result = new ArrayList<>();
        for (int i = 0; i < connectedDevices.size(); i++) {
            addDeviceToCount(connectedDevices.get(i),result);
        }
        for (int i = 0; i < errorDevices.size(); i++) {
            addDeviceToCount(errorDevices.get(i),result);
        }
        return result;

    }
    public void addDevice(Device device){
        connectedDevices.add(device);
    }

    public void addDeviceToCount(Device device,ArrayList arrayList){
        arrayList.add(device);
    }


    public boolean checkForConnect(Device device){
        if(this.producer == device.getProducer()){
            return true;
        }else{
            return false;
        }
    }


    public void secureAddDevice(Device device){
        if(checkForConnect(device)){
            device.changeStatusToConnect();
            addDevice(device);
        }else{
            device.changeStatusToError();
            placeOut(device);
        }
    }


    public void placeOut(Device device){
        errorDevices.add(device);
    }


}
