package com.data_structures.Stack;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;
// import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/*
 * Unit test for StackLinkedList
 */
public class StackLinkedListTest {
    Stack<Integer> stack;
    /*
     * sets up the stack
     */
    @Before
    public void setUp(){
        stack = new StackLinkedList<>();
    }
    /*
     * test for push method 
     */
    @Test
    public void push_test(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals(5, (int)stack.peek());
    }
    /*
     * test for peek method
     */
    @Test
    public void peek_test(){
        stack.push(1);
        stack.push(2);
        assertEquals(2, (int)stack.peek());
    }
    /*
     * test for pop method
     */
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
