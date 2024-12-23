package com.data_structures.Stack;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StackLinkedListTest {
    Stack<Integer> stack;

    @Before
    public void setUp(){
        stack = new StackLinkedList<>();
    }
    @Test
    public void push_test(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, (int)stack.peek());
    }
    @Test
    public void peek_test(){
        stack.push(1);
        stack.push(2);
        assertEquals(2, (int)stack.peek());
    }
    @Test
    public void pop_test(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        assertEquals(3, (int)stack.peek());
    }

}
