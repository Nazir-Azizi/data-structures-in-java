package com.data_structures.Heap;

import java.util.ArrayList;
import java.util.List;

public abstract class Heap<T extends Comparable<T>> {
    int size;
    List<T> list;
    Heap(int size){
        list = new ArrayList<>(size);
        list.addLast(null);
    }
    Heap(){
        this(10);
    }
    public abstract void insert(T data);
    public abstract void remove();
    public T get(){
        if (isEmpty())
            throw new IllegalAccessError("Heap Empty!");
        return list.get(1);
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
