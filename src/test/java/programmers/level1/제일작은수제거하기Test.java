package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 제일작은수제거하기Test {
    @Test
    public void test1() {
        assertArrayEquals(
                new int[]{4, 3, 2},
                new 제일작은수제거하기().solution(new int[]{4, 3, 2, 1})
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[]{-1},
                new 제일작은수제거하기().solution(new int[]{10})
        );
    }
}
