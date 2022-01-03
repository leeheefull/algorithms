package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 신규아이디추천Test {
    private 신규아이디추천 test;

    @BeforeEach
    void setUp() {
        test = new 신규아이디추천();
    }

    @Test
    void test() {
        // test 1
        // given
        String newId = "...!@BaT#*..y.abcdefghijklm";

        // when
        String actual = test.solution(newId);
        String expected = "bat.y.abcdefghi";

        // then
        assertEquals(actual, expected);

        // test 2
        // given
        newId = "z-+.^.";

        // when
        actual = test.solution(newId);
        expected = "z--";

        // then
        assertEquals(actual, expected);

        // test 3
        // given
        newId = "=.=";

        // when
        actual = test.solution(newId);
        expected = "aaa";

        // then
        assertEquals(actual, expected);

        // test 4
        // given
        newId = "123_.def";

        // when
        actual = test.solution(newId);
        expected = "123_.def";

        // then
        assertEquals(actual, expected);

        // test 5
        // given
        newId = "abcdefghijklmn.p";

        // when
        actual = test.solution(newId);
        expected = "abcdefghijklmn";

        // then
        assertEquals(actual, expected);
    }
}