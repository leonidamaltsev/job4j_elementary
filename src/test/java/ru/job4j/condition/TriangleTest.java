package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        double ab = 2;
        double ac = 2;
        double bc = 4;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}