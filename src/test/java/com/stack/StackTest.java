package com.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {

    private static final int STACK_ITEM = 1;
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void new_stack_is_empty() {
        assertEquals(0, stack.size());
    }

    @Test
    void push_increases_size() {
        stack.push(STACK_ITEM);
        assertEquals(1, stack.size());
    }

}
