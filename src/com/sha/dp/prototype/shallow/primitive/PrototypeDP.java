package com.sha.dp.prototype.shallow.primitive;

public class PrototypeDP {
    public static void main(String[] args) throws InterruptedException {
        SampleClass sc = new SampleClass();
        System.out.println(sc.getId());

        SampleClass sc2 = (SampleClass) sc.clone();
//        SampleClass sc2 = new SampleClass();
        System.out.println(sc2.getId());

        sc.setId(3);
        System.out.println(sc.getId());
        System.out.println(sc2.getId());

        System.out.println(sc.hashCode());
        System.out.println(sc2.hashCode());
    }
}
