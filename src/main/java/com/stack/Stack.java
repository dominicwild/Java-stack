package com.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    int size;
    List<Object> items = new ArrayList<Object>();

    public Integer size() {
        return items.size();
    }

    public void push(Object toPush) {
        items.add(toPush);
    }

    public Object pop() {
        if (items.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return items.remove(size() - 1);
    }

}
