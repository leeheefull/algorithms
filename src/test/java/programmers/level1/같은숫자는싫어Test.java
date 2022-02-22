package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 같은숫자는싫어Test {
    private 같은숫자는싫어 test;

    @BeforeEach
    void setUp() {
        test = new 같은숫자는싫어();
    }

    @Test
    void test1() {
        // given
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        // when
        int[] expected = {1, 3, 0, 1};
        int[] actual = test.solution(arr);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] arr = {4, 4, 4, 3, 3};

        // when
        int[] expected = {4, 3};
        int[] actual = test.solution(arr);

        // then
        assertArrayEquals(expected, actual);
    }
}
