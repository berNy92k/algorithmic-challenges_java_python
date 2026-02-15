package net.projecteuler;

public class Problem002 {

    public long sumOfAllFibonacciValuesForMaxLastValue(final int maxValue) {
        int sum = 0;

        int previousValue = 1;
        int currentValue = 2;
        while (currentValue <= maxValue) {
            if (currentValue % 2 == 0) {
                sum += currentValue;
            }
            int tempValue = currentValue;
            currentValue = previousValue + currentValue;
            previousValue = tempValue;
        }

        return sum;
    }
}
