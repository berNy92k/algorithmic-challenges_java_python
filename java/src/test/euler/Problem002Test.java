package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem002Test {

    private Problem002 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem002();
    }

    @Test
    void sumOfAllFibonacciValuesForMaxLastValue_shouldReturnCorrectValue_whenLastValueIsMax100() {
        // given
        final int maxValue = 100;

        // when
        final long sum = problem.sumOfAllFibonacciValuesForMaxLastValue(maxValue);

        // then
        assertEquals(44, sum);
    }

    @Test
    void sumOfAllFibonacciValuesForMaxLastValue_shouldReturnCorrectValue_whenLastValueIsMax4mln() {
        // given
        final int maxValue = 4000000;

        // when
        final long sum = problem.sumOfAllFibonacciValuesForMaxLastValue(maxValue);

        // then
        assertEquals(4613732, sum);
    }
}