package programmers.level2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 문자열압축Test {
    private 문자열압축 test;

    @BeforeEach
    void setUp() {
        test = new 문자열압축();
    }

    @Test
    void test1() {
        // given
        String s = "aabbaccc";

        // when
        int actual = test.solution(s);
        int expected = 7;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        String s = "ababcdcdababcdcd";

        // when
        int actual = test.solution(s);
        int expected = 9;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        // given
        String s = "abcabcdede";

        // when
        int actual = test.solution(s);
        int expected = 8;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test4() {
        // given
        String s = "abcabcabcabcdededededede";

        // when
        int actual = test.solution(s);
        int expected = 14;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test5() {
        // given
        String s = "xababcdcdababcdcd";

        // when
        int actual = test.solution(s);
        int expected = 17;

        // then
        assertEquals(expected, actual);
    }
}
