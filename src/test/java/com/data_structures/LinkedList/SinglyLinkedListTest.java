package com.data_structures.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SinglyLinkedListTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void getSize_whenEmpty_shouldReturnZero(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(0, list.getSize());
    }
    @Test
    public void getSize_whenDateRemoved_shouldWork(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeFirst();
        assertEquals(2, list.getSize());
    }
    @Test
    public void getSize_whenNotEmpty_shouldWork(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.getSize());
    }
    @Test
    public void getSize_whenListBecomeEmpty_shouldreturnZero(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeAll();
        assertEquals(0, list.getSize());
    }
    @Test
    public void isEmpty_whenEmpty_shouldReturnTrue(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
    }
    @Test
    public void isEmpty_whenNotEmpty_shouldReturnFalse(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertFalse(list.isEmpty());
    }
    @Test
    public void contains_whenNotPresent_shouldReturnFalse(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        assertFalse(list.contains(5));
    }   
    @Test
    public void contains_whenPresent_shouldReturnTrue(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        assertTrue(list.contains(1));
    }
}
