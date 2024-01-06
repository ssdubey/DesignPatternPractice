package com.sha.dp.prototype.shallow.primitive;

public class SampleClass implements Cloneable{

    private int id;

    public SampleClass() throws InterruptedException {
        System.out.println("creating object");
        Thread.sleep(2000);
        id = 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        try {
            Object clone = super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


//    @Override
//    public SampleClass clone() {
//        try {
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return (SampleClass) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }
}
