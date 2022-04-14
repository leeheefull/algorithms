package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 문자열내마음대로정렬하기Test {
    @Test
    public void test1() {
        // given
        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        // when
        String[] expected = {"car", "bed", "sun"};
        String[] actual = new 문자열내마음대로정렬하기().solution(strings, n);

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        // when
        String[] expected = {"abcd", "abce", "cdx"};
        String[] actual = new 문자열내마음대로정렬하기().solution(strings, n);

        // then
        assertArrayEquals(expected, actual);
    }
}
