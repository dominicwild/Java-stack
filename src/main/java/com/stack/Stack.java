package com.stack;

public class Stack {

    int size;
    Object pushedItem;

    public Integer size() {
        return size;
    }

    public void push(Object toPush) {
        pushedItem = toPush;
        size++;
    }

    public Object pop() {
        if (pushedItem == null) {
            throw new IllegalStateException("Stack is empty");
        }

        return pushedItem;
    }

}
