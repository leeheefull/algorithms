package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 비밀지도Test {
    private 비밀지도 test;

    @BeforeEach
    void setUp() {
        this.test = new 비밀지도();
    }

    @Test
    void test1() {
        // given
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        // when
        String[] expected = {
                "#####",
                "# # #",
                "### #",
                "#  ##",
                "#####"
        };
        String[] actual = test.solution(n, arr1, arr2);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};

        // when
        String[] expected = {
                "######",
                "###  #",
                "##  ##",
                " #### ",
                " #####",
                "### # "
        };
        String[] actual = test.solution(n, arr1, arr2);

        // then
        assertArrayEquals(expected, actual);
    }
}
