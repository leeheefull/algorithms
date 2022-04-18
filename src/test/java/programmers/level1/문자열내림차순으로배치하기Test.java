package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열내림차순으로배치하기Test {
    @Test
    public void test1() {
        assertEquals(
                "gfedcbZ",
                new 문자열내림차순으로배치하기().solution("Zbcdefg")
        );
    }
}
