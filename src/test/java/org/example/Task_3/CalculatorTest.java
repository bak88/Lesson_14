package org.example.Task_3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();

        Assertions.assertThat(calculator.addition(10, 5)).isEqualTo(15);
        Assertions.assertThat(calculator.addition(-10, 5)).isEqualTo(-5);
        Assertions.assertThat(calculator.addition(10, 0)).isEqualTo(10);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        Assertions.assertThat(calculator.subtract(10, 5)).isEqualTo(5);
        Assertions.assertThat(calculator.subtract(5, 10)).isEqualTo(-5);
        Assertions.assertThat(calculator.subtract(5, 0)).isEqualTo(5);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assertions.assertThat(calculator.multiply(10, 5)).isEqualTo(50);
        Assertions.assertThat(calculator.multiply(10, 0)).isEqualTo(0);
        Assertions.assertThat(calculator.multiply(-10, 5)).isEqualTo(-50);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertThat(calculator.divide(10, 5)).isEqualTo(2);
        Assertions.assertThat(calculator.divide(10, -5)).isEqualTo(-2);
    }

    @Test
    public void testDivideByZeroThrowsException() {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
        } catch (ArithmeticException ex) {
            Assertions.assertThat(ex).hasMessage("Деление на ноль невозможно.");
        }
    }
}
