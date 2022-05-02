package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 정수제곱근판별Test {
    @Test
    public void test1() {
        assertEquals(
                144,
                new 정수제곱근판별().solution(121)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                -1,
                new 정수제곱근판별().solution(3)
        );
    }
}
