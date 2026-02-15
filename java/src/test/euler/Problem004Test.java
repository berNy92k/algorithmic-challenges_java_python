package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem004Test {

    private Problem004 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem004();
    }

    @Test
    void biggestPalindromeFromDigits_shouldReturnCorrectValue_when2DigitsWasSent() {
        // given
        final int value = 2;

        // when
        final long biggestPalindromeFromDigits = problem.biggestPalindromeFromDigits(value);

        // then
        assertEquals(9009, biggestPalindromeFromDigits);
    }

    @Test
    void biggestPalindromeFromDigits_shouldReturnCorrectValue_when3DigitsWasSent() {
        // given
        final int value = 3;

        // when
        final long biggestPalindromeFromDigits = problem.biggestPalindromeFromDigits(value);

        // then
        assertEquals(906609, biggestPalindromeFromDigits);
    }
}