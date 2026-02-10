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

    @Test
    public void testMathAdd() {
        double x = 8;
        double y = 10;

        assertEquals(18, MathUtil.add(x, y), 0.0005);

        x = 8;
        y = -10;

        assertEquals(-2, MathUtil.add(x, y), 0.0005);

        int h = 8;
        y = 10;

        try {
            double z = MathUtil.add(x, h);
        } catch (Exception e) {
            assertNotEquals(null, e);
        }
    }

    @Test
    public void testMathSub() {
        double x = 12;
        double y = 10;

        assertEquals(2, MathUtil.sub(x, y), 0.0005);

        x = 8;
        y = -10;

        assertEquals(18, MathUtil.sub(x, y), 0.0005);

        int h = 8;
        y = 10;

        try {
            double z = MathUtil.sub(x, h);
        } catch (Exception e) {
            assertNotEquals(null, e);
        }
    }


}
