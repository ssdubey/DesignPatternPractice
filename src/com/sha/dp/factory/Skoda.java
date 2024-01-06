package com.sha.dp.factory;

public class Skoda implements Car{

    private String carType;

    public Skoda(String carType){
        this.carType = carType;
    }

    @Override
    public void showPresence() {
        System.out.println("I am a Skoda car of type " + carType);
    }
}
