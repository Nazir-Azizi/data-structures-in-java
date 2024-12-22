package com.data_structures.LinkedList;

public class CircularSinglyLinkedList<T extends Object> {
    private class Node{
        Node next;
        T data;
        Node(T data){
            this.data = data;
        }
    }
    private Node last;
    private int size;

    public boolean isEmpty(){
        return last == null;
    }
    public int getSize(){
        return size;
    }
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
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.data;
    }
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return last.next.data;
    }
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
    public void removeAll(){
        last = null;
        size = 0;
    }
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
