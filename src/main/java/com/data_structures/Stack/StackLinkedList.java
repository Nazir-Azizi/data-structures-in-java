package com.data_structures.Stack;

import java.util.NoSuchElementException;

public class StackLinkedList<T> implements Stack<T>{

    int size;
    private class Node{
        Node next;
        T data;
        Node(T data){
            this.data = data;
        }
    }
    private Node last;
    @Override
    public boolean isEmpty() {
        return last == null;
    }
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void push(T data) {
        Node newNode = new Node(data);
        size++;
        if (last == null){
            last = newNode;
            return;
        }
        newNode.next = last;
        last = newNode;
    }

    @Override
    public T peek() {
        if (last == null)
            throw new NoSuchElementException("Stack is empty");
        return last.data;
    }

    @Override
    public T pop() {
        if (last == null)
            throw new NoSuchElementException("Stack is empty");
        Node temp = last;
        last = last.next;
        size--;
        return temp.data;
    }
    
}
