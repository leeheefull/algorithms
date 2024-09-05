package this_is_coding_test.chapter03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {
    private Question3 q3;

    @BeforeEach
    void setUp() {
        q3 = new Question3();
    }

    @Test
    @DisplayName("3 3 / 3 1 2 / 4 1 4 / 2 2 2")
    void test1() {
        // given
        int n = 3;
        int m = 3;
        int[][] cards = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};

        // when
        int actual = q3.solve(n, m, cards);
        int expected = 2;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2 4 / 7 3 1 8 / 3 3 3 4")
    void test2() {
        // given
        int n = 2;
        int m = 4;
        int[][] cards = {{7, 3, 1, 8}, {3, 3, 3, 4}};

        // when
        int actual = q3.solve(n, m, cards);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }
}