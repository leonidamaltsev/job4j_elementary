package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when20to20then0() {
        double expected = 0;
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when02to22then2() {
        double expected = 2;
        Point a = new Point(0, 2);
        Point b = new Point(2, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when22to20then2() {
        double expected = 2;
        Point a = new Point(2, 2);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}