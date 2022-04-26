package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 이상한문자만들기Test {
    @Test
    public void test1() {
        assertEquals(
                "TrY HeLlO WoRlD",
                new 이상한문자만들기().solution("try hello world")
        );
    }
}
