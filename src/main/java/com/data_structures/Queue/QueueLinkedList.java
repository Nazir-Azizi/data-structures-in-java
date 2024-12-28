package com.data_structures.Queue;

import java.util.NoSuchElementException;

public class QueueLinkedList<T> implements Queue<T>{


    private class Node{
        Node next;
        T data;
        Node(T data){
            this.data = data;
        }
    }

    Node head, tail;
    int size;

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(T data) {
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    @Override
    public T peek() {
        if (head == null)
            throw new NoSuchElementException("Queue is empty");
        return head.data;
    }

    @Override
    public T pop() {
        if (head == null)
            throw new NoSuchElementException("Queue is empty");
        size--;
        T tempData = head.data;
        head = head.next;
        if (head == null)
            tail = null;
        return tempData;
    }
    
}
