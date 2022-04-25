package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 약수의합Test {
    @Test
    public void test1() {
        assertEquals(
                28,
                new 약수의합().solution(12)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                6,
                new 약수의합().solution(5)
        );
    }
}
