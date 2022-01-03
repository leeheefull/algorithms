package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 내적Test {
    private 내적 test;

    @BeforeEach
    void setUp() {
        test = new 내적();
    }

    @Test
    void test1() {
        // given
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        // when
        int actual = test.solution(a, b);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] a = {-1, 0, 1};
        int[] b = {1, 0, -1};

        // when
        int actual = test.solution(a, b);
        int expected = -2;

        // then
        assertEquals(expected, actual);
    }
}
