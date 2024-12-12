package org.howard.edu.lsp.midterm.question2;

public class Calculator {

    /**
     * Returns the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns the sum of two double values.
     *
     * @param a the first double value
     * @param b the second double value
     * @return the sum of a and b
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Returns the sum of all elements in an array of integers.
     *
     * @param array the array of integers to sum
     * @return the total sum of all integers in the array
     * @throws IllegalArgumentException if the input array is null
     */
    public static int sum(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
}