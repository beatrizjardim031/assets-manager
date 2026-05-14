package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssetTest {

    @Test
    public void this_test_should_return_originalCost() {
        //arrange
        Cash cash = new Cash("Emergency Fund: ", "2024-01-01", 500.00);

        //act
        double actual = cash.getValue();
        double expected = 500.00;

        //assert
        assertEquals(expected, actual);
    }
}