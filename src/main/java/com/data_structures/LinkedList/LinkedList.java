package com.data_structures.LinkedList;

import java.util.Collection;

public abstract class LinkedList<T extends Object> {
    
    
    /*
     * Node is an inner class inside LinkedList class
     * It is declared as private so that it wouldn't be accessed from
     * anywhere else but inside LinkedList class
     */
    public class Node{
        T data;
        Node next;
        Node prev;
        Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    // size keeps track of the number of nodes presesnt inside the LinkedList
    public int size = 0;
    // head is the begining of LinkedList
    public Node head = null;
    // tail is the tail of the linkedList
    public Node tail = null;

    /*
     * getSize returns the number of nodes present in the linkedList
     */
    public int getSize(){
        return size;
    }
    /*
     * returns if the LinkedList is empty
     */
    public boolean isEmpty(){
        return head == null;
    }

    /*
     * returns the data of the first node (head)
     */
    public T getFirst(){
        if (head == null)
            return null;
        return head.data;
    }
    /*
     * contains checks if there exist any element 
     * with the specified data
     */
    public boolean contains(T data){
        Node current = head;
        while (current != null){
            if (current.data.equals(data))
                return true;
            current = current.next;
        }
        return false;
    }
    /*
     * removeAll removes all the nodes form the linkedList
     * it will initalize both head and tail to null and other
     * nodes will be distroyed by GC because there will be no
     * refrence variable to refer to the first node, so the first
     * node will be distroyed and there will be no refrence variable to
     * refer to the second node and this way all nodes will be destroyed
     */
    public void removeAll(){
        head = null;
        tail = null;
        size = 0;
    }
    /*
     * toString method is overriden to print all elements to console
     * it iterates over the elements until it reaches null
     */
    @Override
    public String toString(){
        Node current = head;
        String str = "";
        while (current != null){
            str += current.data + " -> ";
            current = current.next;
        }
        str += "null";
        return str;
    }
    /*
     * returns the data of the last node (tail)
     */
    public T getLast(){
        return tail.data;
    }
    /*
    * addFirst is supposed to create a node with the 
    * specifed data and adds it to the beginning of
    * the linkedList
    */
    public abstract void addFirst(T data);
    /*
     * addLast is supposed to create a node with the 
     * specified data and adds it to the end of the
     * linkedList
     */
    public abstract void addLast(T data);
    /*
     * addAll is supposed to receive a Collection object and 
     * adds the data to the end of the linkedList
     */
    public abstract void addAll(Collection<T> collection);
    /*
     * insertAtIndex is supposed to get the data and location
     * in which the data is to be added
     */
    public abstract boolean insertAtIndex(T data, int location);
    /*
     * getAt is supposed to return the node at a specified index
     */
    public abstract T getAt(int index);
    /*
     * removeFirst is supposed to remove the first node
     */
    public abstract boolean removeFirst();
    /*
     * removeLast is supposed to remove the last node
     */
    public abstract boolean removeLast();
    /*
     * removeAt is supposed to remove a node at 
     * the specified index
     */
    public abstract boolean removeAt(int index);
    /*
     * removeValue is supposed to remove a node based
     * on data
     */
    public abstract boolean removeValue(T data);
    /*
     * reverse is supposed to reverse the linkedList
     */
    public abstract void reverse();
}
