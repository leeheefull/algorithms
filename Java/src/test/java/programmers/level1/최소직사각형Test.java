package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 최소직사각형Test {
    private 최소직사각형 test;

    @BeforeEach
    void setUp() {
        this.test = new 최소직사각형();
    }

    @Test
    void test1() {
        // given
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };

        // when
        int actual = test.solution(sizes);

        // then
        assertEquals(4000, actual);
    }

    @Test
    void test2() {
        // given
        int[][] sizes = {
                {10, 7},
                {12, 3},
                {8, 15},
                {14, 7},
                {5, 15}
        };

        // when
        int actual = test.solution(sizes);

        // then
        assertEquals(120, actual);
    }

    @Test
    void test3() {
        // given
        int[][] sizes = {
                {14, 4},
                {19, 6},
                {6, 16},
                {18, 7},
                {7, 11}
        };

        // when
        int actual = test.solution(sizes);

        // then
        assertEquals(133, actual);
    }
}
