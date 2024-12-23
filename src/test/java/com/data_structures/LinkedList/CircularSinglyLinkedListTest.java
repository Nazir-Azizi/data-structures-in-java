package com.data_structures.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/*
 * Unit test for CircularSinglyLinkedList
 */
public class CircularSinglyLinkedListTest {
    CircularSinglyLinkedList<Integer> list;

    /*
     * sets up the list
     */
    @Before
    public void setUp(){
        list = new CircularSinglyLinkedList<>();
    }
    /*
     * test for isEmpty method 
     */
    @Test
    public void isEmpty_whenEmpty_test(){
        assertTrue(list.isEmpty());
    }
    @Test
    public void isEmpty_whenNotEmpty_test(){
        list.add(4);
        assertFalse(list.isEmpty());
    }
    /*
     * test for getSize method
     */
    @Test
    public void getSize_whenZero_test(){
        assertEquals(0,(int) list.getSize());
    }
    @Test
    public void getSize_whenNotZero_test(){
        list.add(1);
        assertEquals(1, list.getSize());
    }
    /*
     * test for getLast method
     */
    @Test
    public void getLast_whenOneNode_test(){
        list.add(5);
        assertEquals(5, (int)list.getLast());
    }
    @Test
    public void getLast_test(){
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, (int)list.getLast());
    }
    /*
     * test for getFirst method 
     */
    @Test
    public void getFirst_whenOneNode(){
        list.add(5);
        assertEquals(5, (int)list.getFirst());
    }
    @Test
    public void getFirst_test(){
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, (int)list.getFirst());
    }
    /*
     * test for remove method 
     */
    @Test
    public void remove_test(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.removeLast();
        assertEquals(2, (int)list.getLast());
    }
}
