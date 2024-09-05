package this_is_coding_test.chapter05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question2Test {
    private Question2 q2;

    @BeforeEach
    void setUp() {
        q2 = new Question2();
    }

    @Test
    @DisplayName("4 5 / 101010 / 111111 / 000001 / 111111 / 111111")
    void test1() {
        // given
        int n = 5;
        int m = 6;
        int[][] map = {
                {1, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };

        // when
        int actual = q2.solve(n, m, map);
        int expected = 10;

        // then
        assertEquals(expected, actual);
    }
}