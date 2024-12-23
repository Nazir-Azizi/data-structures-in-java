package com.data_structures.LinkedList;

public class CircularSinglyLinkedList<T> {
    /*
     * Node class keeps the data and pointers
     */
    private class Node{
        Node next;
        T data;
        Node(T data){
            this.data = data;
        }
    }
    /*
     * last not keeps track of the last node
     */
    private Node last;
    /*
     * size of List
     */
    private int size;
    /*
     * isEmpty returns if the list is empty
     */
    public boolean isEmpty(){
        return last == null;
    }
    /*
     * getSize returns the number of nodes present
     */
    public int getSize(){
        return size;
    }
    /*
     * add method adds data to the end of the list
     */
    public void add(T data){
        Node newNode = new Node(data);
        size++;
        if (isEmpty()){
            last = newNode;
            newNode.next = last;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }
    /*
     * getLast returns the last node of the list
     */
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.data;
    }
    /*
     * getFirst returns the first node of the list
     */
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return last.next.data;
    }
    /*
     * removeLast deletes the last node
     */
    public void removeLast(){
        if (isEmpty())
            return;
        size--;
        Node current = last;
        while(current.next != last)
            current = current.next;
        current.next = last.next;
        last.next = null;
        last = current;
    }
    /*
     * removeAll removes all the nodes and empties the list
     */
    public void removeAll(){
        last = null;
        size = 0;
    }
    /*
     * toString returns the string representation of the list
     */
    @Override
    public String toString() {
        if (last == null)
            return "";
        if (getSize() == 1)
            return "" + last.data;
        String str = "";
        Node current = last.next;
        do {
            str += (current.data) + " -> ";
            current = current.next;
        }while(current != last.next);
        return str;
    }
}
