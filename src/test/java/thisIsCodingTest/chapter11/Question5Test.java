package thisIsCodingTest.chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question5Test {
    private Question5 q5;

    @BeforeEach
    void setUp() {
        q5 = new Question5();
    }

    @Test
    @DisplayName("5 / 3 / 1 3 2 3 2")
    void test1() {
        // given
        int n = 5;
        int maxWeight = 3;
        int[] balls = {1, 3, 2, 3, 2};

        // when
        int actual = q5.solve(n, maxWeight, balls);
        int expected = 8;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("8 / 5 / 1 5 4 3 2 4 5 2")
    void test2() {
        // given
        int n = 8;
        int maxWeight = 5;
        int[] balls = {1, 5, 4, 3, 2, 4, 5, 2};

        // when
        int actual = q5.solve(n, maxWeight, balls);
        int expected = 25;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("5 / 3 / 1 3 2 3 3")
    void test3() {
        // given
        int n = 5;
        int maxWeight = 3;
        int[] balls = {1, 3, 2, 3, 3};

        // when
        int actual = q5.solve(n, maxWeight, balls);
        int expected = 7;

        // then
        assertEquals(expected, actual);
    }
}