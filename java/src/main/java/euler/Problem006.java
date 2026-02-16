package euler;

public class Problem006 {

    public long differenceBetweenSumOfSquaresAndSquareOfSum(final int n) {
        long squaresSum = squaresCalculate(n);
        long squareOfSum = squaresOfSumCalculate(n);

        return squareOfSum - squaresSum;
    }

    private long squaresOfSumCalculate(final int n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum * sum;
    }

    private long squaresCalculate(final int n) {
        long squaresSum = 0;
        for (long i = 1; i <= n; i++) {
            squaresSum = squaresSum + (i * i);
        }

        return squaresSum;
    }
}
