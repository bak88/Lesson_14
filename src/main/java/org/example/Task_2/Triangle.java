package org.example.Task_2;

public class Triangle {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getAreaTriangular(){
        return 0.5 * base * height;
    }
}
