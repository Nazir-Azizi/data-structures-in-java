package com.data_structures.Heap;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MaxHeapTest {
    Heap<Integer> maxHeap;
    @Before
    public void setUp(){
        maxHeap = new MaxHeap<>();
    }
    @Test
    public void insert_test(){
        maxHeap.insert(5);
        maxHeap.insert(2);
        maxHeap.insert(15);
        maxHeap.insert(45);
        maxHeap.insert(2);
        maxHeap.insert(100);
        assertEquals(100, (int)maxHeap.get());
    }
    @Test(timeout =200)
    public void remove_test(){
        maxHeap.insert(5);
        maxHeap.insert(2);
        maxHeap.insert(15);
        maxHeap.insert(45);
        maxHeap.insert(2);
        maxHeap.insert(100);
        maxHeap.remove();
        maxHeap.remove();
        maxHeap.remove();
        assertEquals(5, (int)maxHeap.get());
    }
}
