package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem003Test {

    private Problem003 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem003();
    }

    @Test
    void sumOfAllFibonacciValuesForMaxLastValue_shouldReturnCorrectValue_when13195ValueWasSent() {
        // given
        final long value = 13195L;

        // when
        final long biggestPrimeNumber = problem.biggestPrimeFactorOfTheNumber(value);

        // then
        assertEquals(29, biggestPrimeNumber);
    }

    @Test
    void sumOfAllFibonacciValuesForMaxLastValue_shouldReturnCorrectValue_when600851475143ValueWasSent() {
        // given
        final long value = 600851475143L;

        // when
        final long sum = problem.biggestPrimeFactorOfTheNumber(value);

        // then
        assertEquals(6857, sum);
    }
}