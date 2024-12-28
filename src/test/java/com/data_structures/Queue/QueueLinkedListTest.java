package com.data_structures.Queue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class QueueLinkedListTest {
    
    Queue<Integer> queue;

    @Before
    public void setUp(){
        queue = new QueueLinkedList<>();
    }
    @Test
    public void isEmpty_test(){
        assertTrue(queue.isEmpty());
    }
    @Test
    public void getSize_NoneZero_test(){
        queue.push(1);
        queue.push(2);
        assertEquals(2, (int)queue.getSize());
    }
    @Test
    public void push_test(){
        queue.push(1);
        assertEquals(1, (int)queue.peek());
    }
    @Test
    public void peek_test(){
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertEquals(1, (int)queue.peek());
    }
    @Test
    public void pop_test(){
        queue.push(1);
        queue.push(10);
        queue.push(2);
        queue.push(3);
        queue.pop();
        assertEquals(10, (int)queue.peek());
    }

}
