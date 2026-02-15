package net.projecteuler;

import java.util.stream.IntStream;

// If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3,5,6 and 9. The sum of these multiples is 23.
// Find the sum of all the multiples of 3 or 5 below 1000.
public class Problem001 {

    public long sumOfAllMultiples(final int maxValue, final int multipleA, final int multipleB) {
        int sum = 0;
        for (int i = 1; i < maxValue; i++) {
            if (i % multipleA == 0 || i % multipleB == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public long sumOfAllMultiplesSteam(final int maxValue, final int multipleA, final int multipleB) {
        return IntStream.range(1, maxValue).filter(i -> i % multipleA == 0 || i % multipleB == 0).sum();
    }
}
