package org.example.task17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberUtilsTest {
    @Test
    void exampleTests() {
        assertTrue(NumberUtils.isNarcissistic(153));
        assertTrue(NumberUtils.isNarcissistic(1634));
        assertFalse(NumberUtils.isNarcissistic(112));
    }
}
