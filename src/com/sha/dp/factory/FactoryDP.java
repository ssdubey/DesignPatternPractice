package com.sha.dp.factory;

public class FactoryDP {

    public static void main(String[] args) {
        CarFactory obj = new CarFactory();
        Car marutiObj = obj.getCar(Constants.MARUTI);
        marutiObj.showPresence();

        Car tataCar = obj.getCar(Constants.TATA);
        tataCar.showPresence();

        Car skodaOldCar = obj.getCar(Constants.SKODA, Constants.CAR_TYPE_OLD_CAR);
        skodaOldCar.showPresence();

        Car skodaNewCar = obj.getCar(Constants.SKODA, Constants.CAR_TYPE_NEW_CAR);
        skodaNewCar.showPresence();
    }
}
