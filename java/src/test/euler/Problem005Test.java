package euler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem005Test {

    private Problem005 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem005();
    }

    @Test
    void smallestNumberDividedWithoutAnyReminder_shouldReturnCorrectValue_whenMinIs1AndMaxIs10() {
        // given
        final int min = 1;
        final int max = 10;

        // when
        final long smallestNumber = problem.smallestNumberDividedWithoutAnyReminder(min, max);

        // then
        assertEquals(2520, smallestNumber);
    }

    @Test
    void smallestNumberDividedWithoutAnyReminder_shouldReturnCorrectValue_whenMinIs1AndMaxIs20() {
        // given
        final int min = 1;
        final int max = 20;

        // when
        final long smallestNumber = problem.smallestNumberDividedWithoutAnyReminder(min, max);

        // then
        assertEquals(232792560, smallestNumber);
    }
}