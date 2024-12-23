package com.data_structures.LinkedList;

import java.util.Collection;
import java.util.Iterator;

public class DoublyLinkedList<T> extends LinkedList<T> {

    
    /*
     * addFirst adds the data at the beginning of the list
     */
    @Override
    public void addFirst(T data) {
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    /*
     * addLast adds data at the end of the list
     */
    @Override
    public void addLast(T data) {
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    /*
     * addAll method takes a Collection and adds all the data
     * from the Collection to the list in order
     */
    @Override
    public void addAll(Collection<T> collection){
        Iterator<T> it = collection.iterator();
        if (head == null)
            addFirst(it.next());
        Node current = tail;
        while(it.hasNext()){
            Node newNode = new Node(it.next());
            current.next = newNode;
            newNode.prev = current;
            current = newNode;
            tail = newNode;
            size++;
        }
    }
    /*
     * insertAtIndex methods takes the data and the index which the 
     * data should be inserted in
     */
    @Override
    public boolean insertAtIndex(T data, int location){
        if (location < 1 || location > size + 1)
            return false;
        else if (location == 1)
            addFirst(data);
        else if (location == size + 1)
            addLast(data);
        else{
            Node newNode = new Node(data);
            int count = 1;
            Node current = head;
            while (count != location){
                count++;
                current = current.next;
            }
            Node pre = current.prev;
            newNode.next = current;
            current.prev = newNode;
            pre.next = newNode;
            newNode.prev = pre;
        }
        size++;
        return true;
    }
    /*
     * getAt method returns the data in a specified index
     */
    @Override
    public T getAt(int index){
        if (index < 1 || index > size)
            return null;
        if (index == 1)
            return getFirst();
        if (index == size)
            return getLast();
        int count = 1;
        Node current = head;
        while(count != index){
            current = current.next;
            count++;
        }
        return current.data;
    }
    /*
     * removerFirst removes the first node in the list
     */
    @Override
    public boolean removeFirst() {
        if (head == null)
            return false;
        head.next.prev = null;
        head = head.next;
        size--;
        return true;
    }
    /*
     * removeLast removes the last node
     */
    @Override
    public boolean removeLast() {
        if (tail == null)
            return false;
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        size--;
        return true;
    }
    /*
     * removeAt removes the data in the specified index
     */
    @Override
    public boolean removeAt(int index) {
        if (index < 1 || index > size)
            return false;
        if (index == 1)
            return removeFirst();
        if (index == size)
            return removeLast();
        
        int count = 1;
        Node current = head;
        while(count != index){
            current = current.next;
            count++;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.next = current.prev = null;
        size--;
        return true;
    }
    /*
     * removeValue removes the node according to value
     */
    @Override
    public boolean removeValue(T data) {
        int index = 0;
        Node current = head;
        while (current.data != data){
            current = current.next;
            index++;
        }
        return removeAt(index);
    }
    /*
     * reverse method reverses the list
     */
    @Override
    public void reverse() {
        if (head == null || size == 1)
            return;
        tail = head;
        Node current = head;
        while (current.next != null){
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }
        current.next = current.prev;
        current.prev = null;
        head = current;
    }
}
