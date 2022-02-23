package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 나누어떨어지는숫자배열Test {
    private 나누어떨어지는숫자배열 test;

    @BeforeEach
    void setUp() {
        test = new 나누어떨어지는숫자배열();
    }

    @Test
    void test1() {
        // given
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;


        // when
        int[] expected = {5, 10};
        int[] actual = test.solution(arr, divisor);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;


        // when
        int[] expected = {1, 2, 3, 36};
        int[] actual = test.solution(arr, divisor);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test3() {
        // given
        int[] arr = {3, 2, 6};
        int divisor = 10;


        // when
        int[] expected = {-1};
        int[] actual = test.solution(arr, divisor);

        // then
        assertArrayEquals(expected, actual);
    }
}
