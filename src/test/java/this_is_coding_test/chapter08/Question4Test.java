package this_is_coding_test.chapter08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question4Test {
    private Question4 q4;

    @BeforeEach
    void setUp() {
        q4 = new Question4();
    }

    @Test
    @DisplayName("2 15 / 2 / 3")
    void test1() {
        // given
        int n = 2;
        int m = 15;
        int[] moneys = {2, 3};

        // when
        int actual = q4.solve(n, m, moneys);
        int expected = 5;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("3 4 / 3 / 5 / 7")
    void test2() {
        // given
        int n = 3;
        int m = 4;
        int[] moneys = {3, 5, 7};

        // when
        int actual = q4.solve(n, m, moneys);
        int expected = -1;

        // then
        assertEquals(expected, actual);
    }
}
