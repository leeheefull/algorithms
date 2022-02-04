package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 폰켓몬Test {
    private 폰켓몬 test;

    @BeforeEach
    void setUp() {
        test = new 폰켓몬();
    }

    @Test
    void test1() {
        // given
        int[] param = {3, 1, 2, 3};

        // when
        int actual = test.solution(param);
        int expected = 2;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] param = {3, 3, 3, 2, 2, 4};

        // when
        int actual = test.solution(param);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        // given
        int[] param = {3, 3, 3, 2, 2, 2};

        // when
        int actual = test.solution(param);
        int expected = 2;

        // then
        assertEquals(expected, actual);
    }
}
