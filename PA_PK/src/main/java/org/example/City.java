package org.example;

import org.example.device.Device;

import java.util.ArrayList;

public class City {
    private ArrayList<Gateway> gateways = new ArrayList<>();

    public City(){}


    public void addGateway(Gateway gateway){
        gateways.add(gateway);
    }


    public int countDevicesInGateways(){
        int result = 0;
        for (Gateway gateway : gateways) {
            result += gateway.getDevicesList().size();
        }
        return result;
    }


    public ArrayList<Device> countErrorDevicesInGateways(){
        ArrayList<Device> result = new ArrayList<>();
        for (Gateway gateway : gateways) {
            ArrayList<Device> timerList = gateway.getDevicesList();
            for (int i = 0; i < timerList.size(); i++) {
                if(timerList.get(i).getConnectStatus() == "Error"){
                    result.add(timerList.get(i));
                }
            }

        }
        return result;
    }

}
