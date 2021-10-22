package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int e1 = 5;
        int result = FindLoop.indexOf(data, e1);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas1Then1() {
        int[] data = {5, 4, 3, 2};
        int e1 = 1;
        int result = FindLoop.indexOf(data, e1);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas4Then1() {
        int[] data = {5, 4, 3, 2};
        int e1 = 4;
        int result = FindLoop.indexOf(data, e1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}