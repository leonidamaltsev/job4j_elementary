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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind1() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFind() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 3;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}