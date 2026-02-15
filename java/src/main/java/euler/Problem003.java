package euler;

public class Problem003 {

    public long biggestPrimeFactorOfTheNumber(final long value) {
        long biggestPrimeNumber = 0;

        for (long i = 2; i * i < value; i++) {
            if (value % i == 0) {
                long counter = 0;
                for (long j = 2; j * j < i; j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }

                if (counter == 0) {
                    biggestPrimeNumber = i;
                }
            }
        }


        return biggestPrimeNumber;
    }
}
