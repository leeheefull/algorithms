package this_is_coding_test.chapter05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    @DisplayName("00110 / 00011 / 11111 / 00000")
    void test1() {
        // given
        int n = 4;
        int m = 5;
        int[][] map = {
                {0, 0, 1, 1, 0},
                {0, 0, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}
        };

        // when
        int actual = q1.solve(n, m, map);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("00000111100000 / 11111101111110 / 11011101101110 / 11011101100000 / 11011111111111 / 11011111111100 / 11000000011111 / 01111111111111 / 00000000011111 / 01111111111000 / 00011111111000 / 00000001111000 / 11111111110011 / 11100011111111 / 11100011111111")
    void test2() {
        // given
        int n = 15;
        int m = 14;
        int[][] map = {
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0},
                {1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        // when
        int actual = q1.solve(n, m, map);
        int expected = 8;

        // then
        assertEquals(expected, actual);
    }
}