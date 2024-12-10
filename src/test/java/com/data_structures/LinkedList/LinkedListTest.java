package com.data_structures.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getSize_whenEmpty_shouldReturnZero(){
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(0, list.getSize());
    }
    @Test
    public void isEmpty_whenEmpty_shouldReturnTrue(){
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void contains_whenNotPresent_shouldReturnFalse(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        assertFalse(list.contains(5));
    }   
    @Test
    public void contains_whenPresent_shouldReturnTrue(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        assertTrue(list.contains(1));
    }
}
