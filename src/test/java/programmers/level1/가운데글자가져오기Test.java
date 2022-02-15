package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 가운데글자가져오기Test {
    private 가운데글자가져오기 test;

    @BeforeEach
    void setUp() {
        this.test = new 가운데글자가져오기();
    }

    @Test
    void test1() {
        // given
        String s = "abcde";

        // when
        String actual = test.solution(s);

        // then
        assertEquals("c", actual);
    }

    @Test
    void test2() {
        // given
        String s = "qwer";

        // when
        String actual = test.solution(s);

        // then
        assertEquals("we", actual);
    }
}
