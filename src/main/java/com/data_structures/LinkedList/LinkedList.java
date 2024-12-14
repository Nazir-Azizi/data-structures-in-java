package com.data_structures.LinkedList;

import java.util.Collection;

public interface LinkedList<T extends Object> {
    public abstract int getSize();
    public abstract boolean isEmpty();
    public abstract void addFirst(T data);
    public abstract void addLast(T data);
    public abstract void addAll(Collection<T> collection);
    public abstract boolean insertAtIndex(T data);
    public abstract T getFirst();
    public abstract T getLast();
    public abstract T getAt(int index);
    public abstract boolean contains(T data);
    public abstract boolean removeFirst();
    public abstract boolean removeLast();
    public abstract boolean removeAt(int index);
    public abstract boolean removeValue(T data);
    public abstract void removeAll();
    public abstract void reverse();
    public abstract String toString();
}
