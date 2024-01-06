package com.sha.dp.builder;

public class BuilderDP {

    public static void main(String[] args) {

        Maruti obj = new Maruti.newBuilder().setColour("red").setCost("3lakh").build();
        System.out.println(obj.toString());
    }
}
