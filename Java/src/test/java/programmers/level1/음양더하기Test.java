package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 음양더하기Test {
    private 음양더하기 test;

    @BeforeEach
    void setUp() {
        test = new 음양더하기();
    }

    @Test
    void test1() {
        // given
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        // when
        int actual = test.solution(absolutes, signs);
        int expected = 9;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};

        // when
        int actual = test.solution(absolutes, signs);
        int expected = 0;

        // then
        assertEquals(actual, expected);
    }
}
