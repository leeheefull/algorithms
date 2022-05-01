package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 정수내림차순으로배치하기Test {
    @Test
    public void test1() {
        assertEquals(
                873211,
                new 정수내림차순으로배치하기().solution(118372)
        );
    }
}
