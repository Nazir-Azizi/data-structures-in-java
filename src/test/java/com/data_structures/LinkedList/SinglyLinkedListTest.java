package com.data_structures.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for SinglyLinkedList
 */
public class SinglyLinkedListTest {
     /*
      * test for getSize method
      */
    LinkedList<Integer> list;
    @Before
    public void setUp(){
        list = new SinglyLinkedList<>();
    }
    @Test
    public void getSize_whenEmpty_shouldReturnZero(){
        assertEquals(0, list.getSize());
    }
    @Test
    public void getSize_whenDateRemoved_shouldWork(){
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.removeFirst();
        assertEquals(2, list.getSize());
    }
    @Test
    public void getSize_whenNotEmpty_shouldReturnNoneZero(){
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        assertEquals(3, list.getSize());
    }
    @Test
    public void getSize_whenListBecomeEmpty_shouldReturnZero(){
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
        assertTrue(list.isEmpty());
    }
    @Test
    public void isEmpty_whenNotEmpty_shouldReturnFalse(){
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
        list.addLast(1);
        list.addLast(2);
        assertFalse(list.contains(5));
    }   
    @Test
    public void contains_whenPresent_shouldReturnTrue(){
        list.addLast(1);
        list.addLast(2);
        assertTrue(list.contains(1));
    }

    /*
     * test for addFirst method
     */
    @Test
    public void addFirst_whenAdded_shouldWork(){
        list.addLast(1);
        list.addFirst(2);
        assertEquals(2, (int)list.getFirst());
    }

    /*
     * test for addLast method
     */
    @Test
    public void addLast_whenAdded_shouldWork(){
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, (int)list.getLast());
    }

    /*
     * test for addAll method
     */
    @Test
    public void addAll_whenCollectionAdded_shouldWork(){
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
        list.addLast(1);
        list.addLast(2);
        list.insertAtIndex(5, 2);
        assertEquals(5, (int)list.getAt(2));
    }
    @Test
    public void insertAtIndex_whenAddedAtEnd_shouldWork(){
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.insertAtIndex(5, 5);
        assertEquals(5, (int)list.getAt(5));
    }
}
