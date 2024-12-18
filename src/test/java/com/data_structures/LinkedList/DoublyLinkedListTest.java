package com.data_structures.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class DoublyLinkedListTest {
    
    LinkedList<Integer> list;

    @Before
    public void setUp(){
        list = new DoublyLinkedList<>();
    }

    @Test
    public void addAll_whenListEmpty_shouldWork(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        assertEquals(3, (int)list.getLast());
    }
    @Test
    public void getSize_whenCalled_shouldWork(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        assertEquals(3, (int)list.getSize());
    }
    @Test
    public void removeFirst_whenFirstRemoved(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        list.removeFirst();
        assertEquals(2, (int)list.getFirst());
    }
    @Test
    public void removeLast_shewLastRemoved(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        list.removeLast();
        assertEquals(2, (int)list.getLast());
    }
    @Test
    public void removeAt_whenCalled_shouldRemove(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        list.addLast(4);
        list.removeAt(2);
        assertEquals(3, (int)list.getAt(2));
    }
    @Test
    public void insertAtIndex_whenCalled(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        list.insertAtIndex(10, 2);
        assertEquals(10, (int)list.getAt(2));
    }
    @Test
    public void insertAtIndex_whenInsertAtEnd(){
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        list.addAll(collection);
        list.insertAtIndex(10, 4);
        assertEquals(10, (int)list.getAt(4));
    }
}
