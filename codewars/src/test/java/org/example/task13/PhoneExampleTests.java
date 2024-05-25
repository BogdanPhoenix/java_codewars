package org.example.task13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneExampleTests {
    @Test
    void testPhoneExample() {
        assertEquals("(123) 456-7890", PhoneExample.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
