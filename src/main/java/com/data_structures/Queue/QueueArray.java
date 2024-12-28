package com.data_structures.Queue;

import java.util.ArrayList;
import java.util.List;

public class QueueArray<T> implements Queue<T> {
    List<T> list;
    QueueArray(){
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
        list.addLast(data);
    }
    @Override
    public T peek() {
        return list.getFirst();
    }
    @Override
    public T pop() {
        T tempData = list.getFirst();
        list.removeFirst();
        return tempData;
    }
}
