package com.stack;

public class Stack {

    int size;

    public Integer size() {
        return size;
    }

    public void push(Object toPush) {
        size++;
    }

    public Object pop() {
        throw new IllegalStateException("Stack is empty");
    }
    
}
