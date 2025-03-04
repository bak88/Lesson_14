package org.example;

import org.example.Task_1.Factorialis;
import org.example.Task_2.Triangle;
import org.example.Task_3.Calculator;

public class Main {
    public static void main(String[] args) {

        Factorialis fibonacci = new Factorialis(3);
        fibonacci.getFactorialisNumber();

        Triangle triangle = new Triangle(5, 6);
        double result = triangle.getAreaTriangular();
        System.out.println(result);

        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5.5, 5));

    }
}