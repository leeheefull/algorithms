package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _2016년Test {
    private _2016년 test;

    @BeforeEach
    void setUp() {
        this.test = new _2016년();
    }

    @Test
    void test1() {
        // given
        int a = 5;
        int b = 24;

        // when
        String actual = test.solution(a, b);

        // then
        assertEquals("TUE", actual);
    }
}
