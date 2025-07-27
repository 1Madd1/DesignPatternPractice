package org.example.command_pattern;

public class Demo {
    public static void main(String[] args) {
        System.out.println("The sum of numbers from 1 to 100: " + sumOfSequence(1, 100));
        System.out.println("The sum of squares from 1 to 10: " + sumOfSquares(1, 10));
    }

    private static int sumOfSequence(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += i;
        }
        return sum;
    }

    private static int sumOfSquares(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += i*i;
        }
        return sum;
    }

}
