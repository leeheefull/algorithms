package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 체육복Test {
    private 체육복 test;

    @BeforeEach
    void setUp() {
        test = new 체육복();
    }

    @Test
    void test1() {
        // given
        int n = 5;
        int[] lost = {2, 4};
        int[] reverse = {1, 3, 5};

        // when
        int actual = test.solution(n, lost, reverse);
        int expected = 5;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int n = 5;
        int[] lost = {2, 4};
        int[] reverse = {3};

        // when
        int actual = test.solution(n, lost, reverse);
        int expected = 4;

        // then
        assertEquals(expected, actual);
    }
}
