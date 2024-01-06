package com.sha.dp.prototype.deep.primitive;

public class PrototypeDP {
    public static void main(String[] args) throws InterruptedException {
        SampleClass sc = new SampleClass();
        System.out.println(sc.getId());

        SampleClass sc2 = sc.clone();
//        SampleClass sc2 = new SampleClass();
        sc2.setId(3);
        System.out.println(sc2.getId());

        System.out.println(sc.hashCode());
        System.out.println(sc2.hashCode());
    }
}
