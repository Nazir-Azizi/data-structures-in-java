package com.data_structures.Stack;

public interface Stack<T> {
    /*
     * returns if the stack is empty
     */
    public abstract boolean isEmpty();
    /*
     * returns the number of elements in the stack
     */
    public abstract int getSize();
    /*
     * push method must add the data on top 
     * of the stack
     */
    public abstract void push(T data);
    /*
     * peek method must return a top data
     */
    public abstract T peek();
    /*
     * pop method must remove the top data
     */
    public abstract T pop();
}
