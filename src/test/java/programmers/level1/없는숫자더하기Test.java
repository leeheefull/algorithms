package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 없는숫자더하기Test {
    private 없는숫자더하기 test;

    @BeforeEach
    void setUp() {
        test = new 없는숫자더하기();
    }

    @Test
    void test1() {
        // given
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        // when
        int actual = test.solution(numbers);
        int expected = 14;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};

        // when
        int actual = test.solution(numbers);
        int expected = 6;

        // then
        assertEquals(actual, expected);
    }
}