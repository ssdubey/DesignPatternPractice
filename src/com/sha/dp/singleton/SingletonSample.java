package com.sha.dp.singleton;

public class SingletonSample {

    private static SingletonSample obj;
    private SingletonSample(){

    }

    public static SingletonSample getSingletonSampleObj(){
        if(obj == null){
            obj = new SingletonSample();
        }
        return obj;
    }
}
