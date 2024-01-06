package com.sha.dp.singleton;

public class SingletonDP {

    public static void main(String[] args) {
        NonSingletonSample obj = new NonSingletonSample();
        System.out.println(obj.hashCode());

        NonSingletonSample obj2 = new NonSingletonSample();
        System.out.println(obj2.hashCode());


        SingletonSample sobj = SingletonSample.getSingletonSampleObj();
        System.out.println(sobj.hashCode());

        SingletonSample sobj2 = SingletonSample.getSingletonSampleObj();
        System.out.println(sobj2.hashCode());
    }
}
