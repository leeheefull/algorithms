package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 다트게임Test {
    private 다트게임 test;

    @BeforeEach
    void setUp() {
        test = new 다트게임();
    }

    @Test
    void test1() {
        // given
        String dartResult = "1S2D*3T";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(37, actual);
    }

    @Test
    void test2() {
        // given
        String dartResult = "1D2S#10S";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(9, actual);
    }

    @Test
    void test3() {
        // given
        String dartResult = "1D2S0T";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(3, actual);
    }

    @Test
    void test4() {
        // given
        String dartResult = "1S*2T*3S";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(23, actual);
    }

    @Test
    void test5() {
        // given
        String dartResult = "1D#2S*3S";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(5, actual);
    }

    @Test
    void test6() {
        // given
        String dartResult = "1T2D3D#";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(-4, actual);
    }

    @Test
    void test7() {
        // given
        String dartResult = "1D2S3T*";

        // when
        int actual = test.solution(dartResult);

        // then
        assertEquals(59, actual);
    }
}