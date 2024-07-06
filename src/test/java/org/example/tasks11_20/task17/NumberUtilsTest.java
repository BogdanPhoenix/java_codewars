package org.example.tasks11_20.task17;

import org.example.tasks11_20.task17.NumberUtils;
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
