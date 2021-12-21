package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 실패율Test {
    private 실패율 test;

    @BeforeEach
    void setUp() {
        test = new 실패율();
    }

    @Test
    void test1() {
        // given
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        // when
        int[] actual = test.solution(n, stages);
        int[] expected = {3, 4, 2, 1, 5};

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int n = 4;
        int[] stages = {4, 4, 4, 4, 4};

        // when
        int[] actual = test.solution(n, stages);
        int[] expected = {4, 1, 2, 3};

        // then
        assertArrayEquals(expected, actual);
    }
}
