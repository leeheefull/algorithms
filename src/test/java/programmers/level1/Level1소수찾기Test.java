package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Level1소수찾기Test {
    @Test
    public void test1() {
        assertEquals(
                4,
                new Level1소수찾기().solution(10)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                3,
                new Level1소수찾기().solution(5)
        );
    }
}
