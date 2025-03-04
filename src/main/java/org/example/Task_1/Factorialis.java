package org.example.Task_1;

public class Factorialis {

    private int number;

    public Factorialis(int number) {
        this.number = number;
    }

    public int getFactorialisNumber() {
        int result = 1;

        if (number <= 0)
            return 1;
        else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }
        return result;
    }
}
