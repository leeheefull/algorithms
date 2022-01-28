package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 예산Test {
    private 예산 test;

    @BeforeEach
    void setUp() {
        test = new 예산();
    }

    @Test
    void test1() {
        // given
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;

        // when
        int expected = 3;
        int actual = test.solution(d, budget);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] d = {2, 2, 3, 3};
        int budget = 10;

        // when
        int expected = 4;
        int actual = test.solution(d, budget);

        // then
        assertEquals(expected, actual);
    }
}
