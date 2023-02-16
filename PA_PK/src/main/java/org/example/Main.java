package org.example;

import org.example.device.LightType;
import org.example.device.SmartLight;

public class Main {
    public static void main(String[] args) {

        SmartLight smartLight1 = new SmartLight("Samsung","Galaxy", LightType.HALOGEN,24,"Warning");
        Gateway gateway1 = new Gateway("Samsung","letnia 10");
        City city1 = new City();

        gateway1.secureAddDevice(smartLight1);

        city1.addGateway(gateway1);


    }

}