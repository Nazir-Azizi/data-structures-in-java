package com.data_structures.LinkedList;

import java.util.Collection;
import java.util.Iterator;

class SinglyLinkedList<T extends Object> extends LinkedList<T>{
    
    /*
     * addFirst adds the new Node at the beginning of LinkedList
     * It works by assigning the head to newNode's next and then
     * assigning newNode to head
     */
    public void addFirst(T data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    /*
     * addLast adds the new Node at the end of LinkedList chain
     * First it goes to the end of the list and assign the newNode to
     * the last Node's next
     */
    public void addLast(T data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            size++;
            return;
        }
        Node current = head;
        while(current.next != null)
            current = current.next;
        current.next = newNode;
        size++;
    }
    /*
     * addAll method accepts a Collection and then adds
     * all the elements inside that Collection to LinkedList by
     * getting the iterator and iterating over the collection
     */
    public void addAll(Collection<T> collection){
        Iterator<T> it = collection.iterator();
        Node current = head;
        while (current.next != null)
            current = current.next;
        while(it.hasNext()){
            Node newNode = new Node(it.next());
            current.next = newNode;
            current = newNode;
            size++;
        }
    }
    /*
     * insertAtIndex adds new node at the specified location
     * It uses 1 based indexing
     * First is finds the node at (specified location - 1) 
     * because it has to connect the new node to the chain
     */
    public boolean insertAtIndex(T data, int location){
        if (location < 1){
            return false;
        }
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
        else if (location == 1){
            newNode.next = head;
            head = newNode;
        }else if (location > size){
            Node current = head;
            while(current.next != null)
            current = current.next;
            current.next = newNode;
        }else{
            int count = 1;
            Node current = head;
            while (count < location - 1){
                count++;
                current = current.next;
            }
            Node nextNode = current.next;
            current.next = newNode;
            newNode.next= nextNode;
        }
        size++;
        return true;
    }
    
    /*
     * returns the data of the last node (tail)
     */
    public T getLast(){
        Node current = head;
        while (current.next != null)
            current = current.next;
        return current.data;
    }
    /*
     * getAt method gets the data of a node at a specific index
     * the implementation is straightforward
     */
    public T getAt(int index){
        if (index < 1 || index > size){
            return null;
        }
        Node current = head;
        int count = 1;
        while (count < index){
            current = current.next;
            count++;
        }
        return current.data;
    }
    /*
     * removeFirst removes the first node if it exists
     */
    public boolean removeFirst(){
        if (head == null)
            return false;
        head = head.next;
        size--;
        return true;
    }
    /*
     * removeLast removes the last node if it exist
     */
    public boolean removeLast(){
        if (head == null)
            return false;
        if (size == 1){
            head = null;
        }
        else{
            Node current = head;
            while (current.next.next != null)
                current = current.next;
            current.next = null;
        }
        size--;
        return true;
    }
    /*
     * removeAt method removes the specified node
     * from the LinkedList
     */
    public boolean removeAt(int index){
        if (index > size || index < 1){
            return false;
        }
        if (index == 1)
            return removeFirst();
        if (index == size)
            return removeLast();
        
        int count = 1;
        Node current = head;
        while (count < index - 1){
            current = current.next;
            count++;
        }
        current.next = current.next.next;
        size--;
        return true;
    }
    /*
     * removeValue removes a node by value and not
     * by index
     * Every poosible situation is considered
     */
    public boolean removeValue(T data){
        if (head == null)
            return false;
        if (head.data == data){
            head = head.next;
            size--;
            return true;
        }
        Node current = head;
        Node prevNode = null;
        while (current != null && current.data != data){
            prevNode = current;
            current = current.next;
        }
        if (current == null)
            return false;
        prevNode.next = current.next;
        size--;
        return true;
    }
    
    public void reverse(){
        if (head == null || size == 1)
            return;
        Node current, next, prev;
        current = head.next;
        prev = head;
        next = current.next;

        prev.next = null;
        while (next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        head = current;
    }
}