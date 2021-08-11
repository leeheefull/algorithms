package thisIsCodingTest.chapter04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question4Test {
    private Question4 q4;

    @BeforeEach
    void setUp() {
        q4 = new Question4();
    }

    @Test
    @DisplayName("4 4 / 1 1 0 / 1 1 1 1 / 1 0 0 1 / 1 1 0 1 / 1 1 1 1")
    void test1() {
        // given
        int n = 4;
        int m = 4;
        int x = 1;
        int y = 1;
        int news = 0;
        int[][] map = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};

        // when
        int actual = q4.solve(n, m, x, y, news, map);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }
}