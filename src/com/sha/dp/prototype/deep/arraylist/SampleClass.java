package com.sha.dp.prototype.deep.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SampleClass implements Cloneable{

    private List id;

    public List getId() {
        return id;
    }

    public void setId(List id) {
        this.id = id;
    }

    public void setIdAtIndex(int i, int n) {
        this.id.set(i, n);
    }

    public SampleClass() throws InterruptedException {
        System.out.println("creating object");
        Thread.sleep(2000);
        id = new ArrayList<>();
        id.add(1);
        id.add(2);
        id.add(3);
    }

    @Override
    public SampleClass clone() {
        try {
            SampleClass clone = (SampleClass) super.clone();

            List newList = new ArrayList<>();
            newList.addAll(clone.getId());
            clone.setId(newList);
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
