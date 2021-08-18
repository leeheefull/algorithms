package thisIsCodingTest.chapter06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    @DisplayName("3 / 15 27 12")
    void test1() {
        // given
        int n = 3;
        int[] arr = {15, 27, 12};

        // when
        int[] actual = q1.solve(n, arr);
        int[] expected = {27, 15, 12};

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("10 / 7 5 9 0 3 1 6 2 4 8")
    void test2() {
        // given
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        // when
        int[] actual = q1.solve(n, arr);
        int[] expected = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        // then
        assertArrayEquals(expected, actual);
    }
}
