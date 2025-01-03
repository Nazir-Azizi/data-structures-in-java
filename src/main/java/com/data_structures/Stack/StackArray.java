package com.data_structures.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackArray<T> implements Stack<T>{
    /*
     * ArrayList is used to contain the data
     */
    List<T> list;
    StackArray(){
        list = new ArrayList<>();
    }
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    @Override
    public int getSize() {
        return list.size();
    }
    @Override
    public void push(T data) {
        list.add(data);
    }

    @Override
    public T peek() {
        return list.getLast();
    }

    @Override
    public T pop() {
        T tempData = list.getLast();
        list.removeLast();  
        return tempData;
    }
    
}
