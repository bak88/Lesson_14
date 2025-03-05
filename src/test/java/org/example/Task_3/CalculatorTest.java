package org.example.Task_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.addition(10, 5);
        Assert.assertEquals(result, 15);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(10, 5);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 5);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testDivideByZeroThrowsException() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException e) {
            Assert.assertEquals(e.getMessage(), "Деление на ноль невозможно.");
        }
    }
}
