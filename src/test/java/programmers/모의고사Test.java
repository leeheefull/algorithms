package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 모의고사Test {
    private 모의고사 test;

    @BeforeEach
    void setUp() {
        test = new 모의고사();
    }

    @Test
    void test1() {
        // given
        int[] answers = {1, 2, 3, 4, 5};

        // when
        int[] actual = test.solution(answers);
        int[] expected = {1};

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] answers = {1, 3, 2, 4, 2};

        // when
        int[] actual = test.solution(answers);
        int[] expected = {1, 2, 3};

        // then
        assertArrayEquals(expected, actual);
    }
}
