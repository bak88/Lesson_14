package org.example.Task_2;

public class Triangle {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Основание и высота должны быть положительными числами");
        }
        this.base = base;
        this.height = height;
    }

    public double getAreaTriangular(){
        return 0.5 * base * height;
    }
}
