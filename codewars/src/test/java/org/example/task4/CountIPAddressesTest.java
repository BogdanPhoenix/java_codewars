package org.example.task4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountIPAddressesTest {
    @ParameterizedTest
    @MethodSource("values")
    void Tests(long expected, String firstIP, String secondIP) {
        assertEquals(expected, CountIPAddresses.ipsBetween(firstIP, secondIP));
    }

    private static Stream<Arguments> values() {
        return Stream.of(
                Arguments.of(50, "10.0.0.0", "10.0.0.50"),
                Arguments.of(246, "20.0.0.10", "20.0.1.0"),
                Arguments.of((1L << 32L) - 1L, "0.0.0.0", "255.255.255.255")
        );
    }
}
