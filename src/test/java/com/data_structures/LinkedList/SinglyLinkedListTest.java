package com.data_structures.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SinglyLinkedListTest {
     /*
      * test for getSize method
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
    public void getSize_whenNotEmpty_shouldReturnNoneZero(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.getSize());
    }
    @Test
    public void getSize_whenListBecomeEmpty_shouldReturnZero(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeAll();
        assertEquals(0, list.getSize());
    }

    /*
     * test for isEmpty method
     */
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

    /*
     * test for contains method
     */
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

    /*
     * test for addFirst method
     */
    @Test
    public void addFirst_whenAdded_shouldWork(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addFirst(2);
        assertEquals(2, (int)list.getFirst());
    }

    /*
     * test for addLast method
     */
    @Test
    public void addLast_whenAdded_shouldWork(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, (int)list.getLast());
    }

    /*
     * test for addAll method
     */
    @Test
    public void addAll_whenCollectionAdded_shouldWork(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        
        list.addAll(list2);
        assertEquals(5, (int)list.getLast());
    }

    /*
     * test for insertAtIndex
     */
    @Test
    public void insertAtIndex_whenAdded_shouldWork(){
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.insertAtIndex(5, 2);
        assertEquals(5, (int)list.getAt(2));
    }
}
