package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 수박수박수박수박수박수Test {
    @Test
    public void test1() {
        assertEquals(
                "수박수",
                new 수박수박수박수박수박수().solution(3)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "수박수박",
                new 수박수박수박수박수박수().solution(4)
        );
    }
}
