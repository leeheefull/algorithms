package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 최대공약수와최소공배수Test {
    @Test
    public void test1() {
        assertArrayEquals(
                new int[]{3, 12},
                new 최대공약수와최소공배수().solution(3, 12)
        );
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[]{1, 10},
                new 최대공약수와최소공배수().solution(2, 5)
        );
    }
}
