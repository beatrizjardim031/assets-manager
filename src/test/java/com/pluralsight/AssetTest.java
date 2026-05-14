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

    @Test
    public void this_test_should_return_description() {
        //arrange
        Cash cash = new Cash("Emergency Fund: ", "2024-01-01", 500.00);

        //act
        String actual = cash.getDescription();
        String expected = "Emergency Fund: ";

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void this_test_should_return_value() {
        //arrange
        House house = new House("Hobbit Hole / Smial", "April 12, 2841", 450.000, "Bag End, Underhill, Hobbiton", 1, 1250, 1575);

        //act
        double actual = house.getValue();
        double expected = (180 * 1250) + (0.25 * 1575);

        //assert
        assertEquals(expected, actual);
    }
}