package com.sha.dp.prototype.deep.arraylist;

public class PrototypeDP {
    public static void main(String[] args) throws InterruptedException {
        SampleClass sc = new SampleClass();
        System.out.println(sc.getId());

        SampleClass sc2 = sc.clone();

        System.out.println(sc2.getId());

        sc.setIdAtIndex(1, 8);

        System.out.println(sc.getId());
        System.out.println(sc2.getId());

    }
}
