package this_is_coding_test.chapter12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question9Test {
    private Question9 q9;

    @BeforeEach
    void setUp() {
        q9 = new Question9();
    }

    @Test
    @DisplayName("aabbaccc")
    void test1() {
        // given
        String input = "aabbaccc";

        // when
        int actual = q9.solve(input);
        int expected = 7;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("ababcdcdababcdcd")
    void test2() {
        // given
        String input = "ababcdcdababcdcd";

        // when
        int actual = q9.solve(input);
        int expected = 9;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("abcabcdede")
    void test3() {
        // given
        String input = "abcabcdede";

        // when
        int actual = q9.solve(input);
        int expected = 8;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("abcabcabcabcdededededede")
    void test4() {
        // given
        String input = "abcabcabcabcdededededede";

        // when
        int actual = q9.solve(input);
        int expected = 14;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("xababcdcdababcdcd")
    void test5() {
        // given
        String input = "xababcdcdababcdcd";

        // when
        int actual = q9.solve(input);
        int expected = 17;

        // then
        assertEquals(expected, actual);
    }
}