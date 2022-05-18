package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 콜라츠추측Test {
    @Test
    public void test1() {
        assertEquals(
                8,
                new 콜라츠추측().solution(6)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                4,
                new 콜라츠추측().solution(16)
        );
    }

    @Test
    public void test3() {
        assertEquals(
                -1,
                new 콜라츠추측().solution(626331)
        );
    }
}
