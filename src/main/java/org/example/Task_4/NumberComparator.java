package org.example.Task_4;

public class NumberComparator {

    private int num1;
    private int num2;

    public NumberComparator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void compare() {
        if (num1 > num2) {
            System.out.println(num1 + " больше чем " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " меньше чем " + num2);
        } else {
            System.out.println(num1 + " равно " + num2);
        }
    }
}