package euler;

public class Problem007 {

    public long findNPrimeNumber(final int n) {
        long primeNumber = 1;
        long counterOfPrimeNumbers = 0;

        long currentNb = 1;
        while (counterOfPrimeNumbers < n) {
            currentNb++;

            long counter = 0;
            for (int i = 2; i <= currentNb; i++) {
                if (currentNb % i == 0) {
                    counter++;
                }
            }

            if (counter == 1) {
                counterOfPrimeNumbers++;
                primeNumber = currentNb;
            }
        }

        return primeNumber;
    }
}
