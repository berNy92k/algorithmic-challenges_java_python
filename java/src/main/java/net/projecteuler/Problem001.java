package net.projecteuler;

import java.util.stream.IntStream;

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
