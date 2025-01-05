package com.data_structures.Heap;

import java.util.Collections;

public class MaxHeap<T extends Comparable<T>> extends Heap<T>{

    MaxHeap(int size){
        super(size);
    }
    MaxHeap(){
        super();
    }
    @Override
    public void insert(T data) {
        list.addLast(data);
        size++;
        int index = (int) (size / 2);
        int current = size;
        while(index > 0 && data.compareTo(list.get(index)) > 0){
            Collections.swap(list, index, current);
            current = index;
            index = (int) (index / 2);
        }
    }
    @Override
    public void remove() {
        if (isEmpty())
            throw new IllegalAccessError("Heap Empty");
        Collections.swap(list, 1, size);
        list.removeLast();
        size--;
        reheapfy();
    }
    private void reheapfy(){
        int current = 1;
        while (current * 2 < size){
            int child = current * 2;
            if (child < size && (list.get(child).compareTo(list.get(child + 1)) < 0))
                child++;
            if (list.get(current).compareTo(list.get(child)) < 0){
                Collections.swap(list, child, current);
                current = child;
            }
        }
    }
}
