package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class K번째수Test {
    private K번째수 test;

    @BeforeEach
    void setUp() {
        test = new K번째수();
    }

    @Test
    void test1() {
        // given
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // when
        int[] actual = test.solution(array, commands);
        int[] expected = {5, 6, 3};

        // then
        assertArrayEquals(expected, actual);
    }
}
