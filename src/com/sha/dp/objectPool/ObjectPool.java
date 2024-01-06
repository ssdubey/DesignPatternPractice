package com.sha.dp.objectPool;

import java.util.concurrent.ConcurrentLinkedDeque;

public abstract class ObjectPool<T> {

    private ConcurrentLinkedDeque<T> pool;

    public ObjectPool (int size){
        pool = new ConcurrentLinkedDeque<>();
        initialize(pool);
    }

    private void initialize(ConcurrentLinkedDeque<T> pool) {
        for (int i = 0; i < ; i++) {
            
        }
        pool.add(create());
    }

    protected abstract T create();

    public int poolSize(){
        return pool.size();
    }

    public void borrowObject(){
        T obj = pool.poll();
        if(obj == null){
            create();
        }
    }
}
