package org.howard.edu.lsp.midterm.question2;

public class Calculator {

    // Sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Sum two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // Sum all elements in an array of integers
    public static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}