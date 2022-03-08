package com.stack;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class StackTest {

    private static final Object STACK_ITEM = 1;
    private static final Object LAST_STACK_ITEM = 22;
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void new_stack_is_empty() {
        assertEquals(0, stack.size());
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 })
    void push_increases_size(int numberOfTimesToPush) {
        for (int i = 0; i < numberOfTimesToPush; i++) {
            stack.push(STACK_ITEM);
        }

        assertEquals(numberOfTimesToPush, stack.size());
    }

    @Test
    void pop_throws_exception_when_stack_is_empty() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    void push_does_not_throw_exception(){
        assertDoesNotThrow(() -> stack.push(STACK_ITEM));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4, 5 })
    void pop_returns_last_item_pushed(int numberOfTimesToPush) {
        for (int i = 0; i < numberOfTimesToPush - 1; i++) {
            stack.push(STACK_ITEM);
        }

        stack.push(LAST_STACK_ITEM);

        assertEquals(LAST_STACK_ITEM, stack.pop());
    }

}
