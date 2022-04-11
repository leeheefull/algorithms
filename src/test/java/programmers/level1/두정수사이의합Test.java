package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 두정수사이의합Test {
    @Test
    public void test1() {
        assertEquals(12, new 두정수사이의합().solution(3, 5));
    }

    @Test
    public void test2() {
        assertEquals(3, new 두정수사이의합().solution(3, 3));
    }

    @Test
    public void test3() {
        assertEquals(12, new 두정수사이의합().solution(5, 3));
    }
}
