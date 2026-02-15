package euler;

public class Problem004 {

    public long biggestPalindromeFromDigits(final int digits) {
        int number = Integer.parseInt("9".repeat(digits));

        long biggestPalindromeFromDigits = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                int value = i * j;
                if (isPalindrome(value)) {
                    biggestPalindromeFromDigits = Math.max(biggestPalindromeFromDigits, value);
                }
            }
        }

        return biggestPalindromeFromDigits;
    }

    private boolean isPalindrome(final int value) {
        String valueAsString = String.valueOf(value);
        String reversedValueAsString = new StringBuilder(valueAsString).reverse().toString();
        return valueAsString.equals(reversedValueAsString);
    }
}
