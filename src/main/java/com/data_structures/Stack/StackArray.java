package com.data_structures.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackArray<T> implements Stack<T>{
    List<T> list;
    StackArray(){
        list = new ArrayList<>();
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
    public void pop() {
        list.removeLast();  
    }
    
}
