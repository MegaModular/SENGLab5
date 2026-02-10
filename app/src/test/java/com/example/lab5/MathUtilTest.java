package com.example.lab5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
public class MathUtilTest {

    @Test
    public void testAbsValuePositive() {
        double input = 8;
        double actualAbs = MathUtil.abs(input);
        double expectedValue = input;

        assertEquals(expectedValue, actualAbs, 0.0005);
    }
    @Test
    public void testAbsValueNegative() {
        double input = 8;
        double actualAbs = MathUtil.abs(input);
        double expectedValue = input*-1;

        assertNotEquals(expectedValue, actualAbs, 0.0005);
    }



}
