package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 자릿수더하기Test {
    @Test
    public void test1() {
        assertEquals(
                6,
                new 자릿수더하기().solution(123)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                24,
                new 자릿수더하기().solution(987)
        );
    }
}
