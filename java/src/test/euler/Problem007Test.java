package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem007Test {

    private Problem007 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem007();
    }

    @Test
    void findNPrimeNumber_shouldReturnCorrectValue_whenNIs6() {
        // given
        final int n = 6;

        // when
        final long result = problem.findNPrimeNumber(n);

        // then
        assertEquals(13, result);
    }

    @Test
    void findNPrimeNumber_shouldReturnCorrectValue_whenNIs10001() {
        // given
        final int n = 10001;

        // when
        final long result = problem.findNPrimeNumber(n);

        // then
        assertEquals(104743, result);
    }
}