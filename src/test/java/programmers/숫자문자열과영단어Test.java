package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 숫자문자열과영단어Test {
    private 숫자문자열과영단어 test;

    @BeforeEach
    void setUp() {
        test = new 숫자문자열과영단어();
    }

    @Test
    void test1() {
        // given
        String s = "one4seveneight";

        // when
        int actual = test.solution(s);
        int expected = 1478;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        String s = "23four5six7";

        // when
        int actual = test.solution(s);
        int expected = 234567;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test3() {
        // given
        String s = "2three45sixseven";

        // when
        int actual = test.solution(s);
        int expected = 234567;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test4() {
        // given
        String s = "123";

        // when
        int actual = test.solution(s);
        int expected = 123;

        // then
        assertEquals(actual, expected);
    }
}
