package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 키패드누르기Test {
    private 키패드누르기 test;

    @BeforeEach
    void setUp() {
        test = new 키패드누르기();
    }

    @Test
    void test1() {
        // given
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        // when
        String actual = test.solution(numbers, hand);
        String expected = "LRLLLRLLRRL";

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        // when
        String actual = test.solution(numbers, hand);
        String expected = "LRLLRRLLLRR";

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test3() {
        // given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";

        // when
        String actual = test.solution(numbers, hand);
        String expected = "LLRLLRLLRL";

        // then
        assertEquals(actual, expected);
    }
}