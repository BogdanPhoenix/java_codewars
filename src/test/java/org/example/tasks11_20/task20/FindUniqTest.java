package org.example.tasks11_20.task20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindUniqTest {

    @Test
    void sampleTestCases() {
        double precision = 0.0000000000001;
        assertEquals(1.0, FindUniq.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0, FindUniq.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
