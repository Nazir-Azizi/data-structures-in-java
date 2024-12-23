package com.data_structures.Stack;

public interface Stack<T> {
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
    public abstract void pop();
}
