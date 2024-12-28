package com.data_structures.Queue;

public interface Queue<T> {
    /*
     * returns if the Queue is empty
     */
    public abstract boolean isEmpty();
    /*
     * returns the number of elements in Queue
     */
    public abstract int getSize();
    /*
     * adds the element into the Queue
     */
    public abstract void push(T data);
    /*
     * returns the first element
     */
    public abstract T peek();
    /*
     * returns and removes the first element
     */
    public abstract T pop();
}
