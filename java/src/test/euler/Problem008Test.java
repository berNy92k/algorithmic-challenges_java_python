package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem008Test {

    private Problem008 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem008();
    }

    @Test
    void findNAdjacentDigitsWithBiggestResult_shouldReturnCorrectValue_whenNIs4() {
        // given
        final int n = 4;

        // when
        final long result = problem.findNAdjacentDigitsWithBiggestResult(n);

        // then
        assertEquals(5832, result);
    }

    @Test
    void findNAdjacentDigitsWithBiggestResult_shouldReturnCorrectValue_whenNIs13() {
        // given
        final int n = 13;

        // when
        final long result = problem.findNAdjacentDigitsWithBiggestResult(n);

        // then
        assertEquals(23514624000L, result);
    }
}