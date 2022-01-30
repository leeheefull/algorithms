package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 두개뽑아서더하기Test {
    private 두개뽑아서더하기 test;

    @BeforeEach
    void setUp() {
        test = new 두개뽑아서더하기();
    }

    @Test
    void test1() {
        // given
        int[] numbers = {2, 1, 3, 4, 1};

        // when
        int[] expected = {2, 3, 4, 5, 6, 7};
        int[] actual = test.solution(numbers);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        int[] numbers = {5, 0, 2, 7};

        // when
        int[] expected = {2, 5, 7, 9, 12};
        int[] actual = test.solution(numbers);

        // then
        assertArrayEquals(expected, actual);
    }
}
