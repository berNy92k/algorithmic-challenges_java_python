package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem006Test {

    private Problem006 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem006();
    }

    @Test
    void differenceBetweenSumOfSquaresAndSquareOfSum_shouldReturnCorrectValue_whenNIs10() {
        // given
        final int n = 10;

        // when
        final long result = problem.differenceBetweenSumOfSquaresAndSquareOfSum(n);

        // then
        assertEquals(2640, result);
    }

    @Test
    void differenceBetweenSumOfSquaresAndSquareOfSum_shouldReturnCorrectValue_whenNIs100() {
        // given
        final int n = 100;

        // when
        final long result = problem.differenceBetweenSumOfSquaresAndSquareOfSum(n);

        // then
        assertEquals(25164150, result);
    }
}