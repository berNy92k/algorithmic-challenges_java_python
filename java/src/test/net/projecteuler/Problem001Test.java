package net.projecteuler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem001Test {

    private Problem001 problem;

    @BeforeEach
    void setUp() {
        problem = new Problem001();
    }

    @Test
    void sumOfAllMultiples_shouldReturnCorrectValue_whenMultipleOf3And5ForNumbersBelow10() {
        // given
        final int maxValue = 10;
        final int multipleA = 3;
        final int multipleB = 5;

        // when
        final long sum = problem.sumOfAllMultiples(maxValue, multipleA, multipleB);

        // then
        assertEquals(23, sum);
    }

    @Test
    void sumOfAllMultiples_shouldReturnCorrectValue_whenMultipleOf3And5ForNumbersBelow1000() {
        // given
        final int maxValue = 1000;
        final int multipleA = 3;
        final int multipleB = 5;

        // when
        final long sum = problem.sumOfAllMultiples(maxValue, multipleA, multipleB);

        // then
        assertEquals(233168, sum);
    }
}