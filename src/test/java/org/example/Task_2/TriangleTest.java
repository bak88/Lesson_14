package org.example.Task_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(10, 5);
        double area = triangle.getAreaTriangular();
        Assert.assertEquals(area, 25.0);
    }

    @Test
    public void testZeroBaseThrowsException() {
        try {
            new Triangle(0, 5);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть положительными числами");
        }
    }

    @Test
    public void testZeroHeightThrowsException() {
        try {
            new Triangle(10, 0);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть положительными числами");
        }
    }

    @Test
    public void testNegativeBaseThrowsException() {
        try {
            new Triangle(-1, 10);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть положительными числами");
        }
    }

    @Test
    public void testNegativeHeightThrowsException() {
        try {
            new Triangle(10, -1);
        } catch (IllegalArgumentException e) {
            Assert.assertEquals(e.getMessage(), "Основание и высота должны быть положительными числами");
        }
    }
}
