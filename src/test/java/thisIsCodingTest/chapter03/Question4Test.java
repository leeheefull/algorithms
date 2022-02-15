package thisIsCodingTest.chapter03;

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
    @DisplayName("17 4")
    void test1() {
        // given
        int n = 17;
        int k = 4;

        // when
        int actual = q4.solve(n, k);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("25 5")
    void test2() {
        // given
        int n = 25;
        int k = 5;

        // when
        int actual = q4.solve(n, k);
        int expected = 2;

        // then
        assertEquals(expected, actual);
    }
}