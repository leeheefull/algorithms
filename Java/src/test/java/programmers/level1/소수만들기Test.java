package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 소수만들기Test {
    private 소수만들기 test;

    @BeforeEach
    void setUp() {
        test = new 소수만들기();
    }

    @Test
    void test1() {
        // given
        int[] nums = {1, 2, 3, 4};

        // when
        int actual = test.solution(nums);
        int expected = 1;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] nums = {1, 2, 7, 6, 4};

        // when
        int actual = test.solution(nums);
        int expected = 4;

        // then
        assertEquals(expected, actual);
    }
}
