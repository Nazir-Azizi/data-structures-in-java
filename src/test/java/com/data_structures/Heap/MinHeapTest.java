package com.data_structures.Heap;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinHeapTest {
    Heap<Integer> minHeap;
    @Before
    public void setUp(){
        minHeap = new MinHeap<>();
    }
    @Test
    public void insert_test(){
        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(15);
        minHeap.insert(45);
        minHeap.insert(2);
        minHeap.insert(100);
        assertEquals(2, (int)minHeap.get());
    }
    @Test(timeout =200)
    public void remove_test(){
        minHeap.insert(5);
        minHeap.insert(2);
        minHeap.insert(15);
        minHeap.insert(45);
        minHeap.insert(2);
        minHeap.insert(100);
        minHeap.remove();
        minHeap.remove();
        minHeap.remove();
        minHeap.remove();
        assertEquals(45, (int)minHeap.get());
    }
}
