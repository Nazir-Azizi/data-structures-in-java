package com.data_structures.LinkedList;

import java.util.Collection;

public interface LinkedList<T extends Object> {
    /*
     * getSize is supposed to return the 
     * size (number of Nodes) of the linkedList
     */
    public abstract int getSize();
    /*
     * isEmpty is supposed to return a boolean value
     * indicating whether the LinkedList is empty
     */
    public abstract boolean isEmpty();
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
     * getFirst is supposed to return the first node
     */
    public abstract T getFirst();
    /*
     * getLast is supposed to return the last node
     */
    public abstract T getLast();
    /*
     * getAt is supposed to return the node at a specified index
     */
    public abstract T getAt(int index);
    /*
     * contains is supposed to return a boolean value
     * indicating whether a certain data is present in linkedList
     */
    public abstract boolean contains(T data);
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
     * removeAll removes all the nodes
     */
    public abstract void removeAll();
    /*
     * reverse is supposed to reverse the linkedList
     */
    public abstract void reverse();
    /*
     * toString is supposed to return a string containing
     * all the data in linkedList
     */
    public abstract String toString();
}
