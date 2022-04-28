package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 자연수뒤집어배열로만들기Test {
    @Test
    public void test1() {
        assertArrayEquals(
                new int[]{5, 4, 3, 2, 1},
                new 자연수뒤집어배열로만들기().solution(12345)
        );
    }
}
