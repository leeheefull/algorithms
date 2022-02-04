package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 로또의최고순위와최저순위Test {
    private 로또의최고순위와최저순위 test;

    @BeforeEach
    void setUp() {
        test = new 로또의최고순위와최저순위();
    }

    @Test
    void test1() {
        // given
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] winNums = {31, 10, 45, 1, 6, 19};

        // when
        int[] actual = test.solution(lottos, winNums);
        int[] expected = {3, 5};

        // then
        assertArrayEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] winNums = {38, 19, 20, 40, 15, 25};

        // when
        int[] actual = test.solution(lottos, winNums);
        int[] expected = {1, 6};

        // then
        assertArrayEquals(actual, expected);
    }

    @Test
    void test3() {
        // given
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] winNums = {20, 9, 3, 45, 4, 35};

        // when
        int[] actual = test.solution(lottos, winNums);
        int[] expected = {1, 1};

        // then
        assertArrayEquals(actual, expected);
    }
}