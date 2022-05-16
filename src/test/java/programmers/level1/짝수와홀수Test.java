package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 짝수와홀수Test {
    @Test
    public void test1() {
        assertEquals(
                "Odd",
                new 짝수와홀수().solution(3)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "Even",
                new 짝수와홀수().solution(4)
        );
    }
}
