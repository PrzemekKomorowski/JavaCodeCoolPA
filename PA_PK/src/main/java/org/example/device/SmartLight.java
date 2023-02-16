package org.example.device;

public class SmartLight extends Device{

    private LightType lightType;
    private int power;

    public SmartLight(String producer, String modelName,LightType lightType, int warranty, String connectStatus) {
        super(producer, modelName, warranty, connectStatus);
        this.lightType = lightType;
        setPower();

    }

    public void setPower(){
        if(this.lightType == LightType.HALOGEN){
            this.power = 200;
        }else{
            this.power = 150;
        }
    }





}
