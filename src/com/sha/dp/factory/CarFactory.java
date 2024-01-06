package com.sha.dp.factory;

public class CarFactory {



    public Car getCar(String carName){
        if(carName.equalsIgnoreCase(Constants.MARUTI)){
            return new Maruti();
        } else if (carName.equalsIgnoreCase(Constants.TATA)) {
            return new Tata();
        }
        return null;
    }

    public Car getCar(String carName, String carType){
        if(carName.equalsIgnoreCase(Constants.SKODA)){
            if(carType.equalsIgnoreCase(Constants.CAR_TYPE_NEW_CAR)){
                return new Skoda(Constants.CAR_TYPE_NEW_CAR);
            }else if(carType.equalsIgnoreCase(Constants.CAR_TYPE_OLD_CAR)){
                return new Skoda(Constants.CAR_TYPE_OLD_CAR);
            }
        }
        return null;
    }
}
