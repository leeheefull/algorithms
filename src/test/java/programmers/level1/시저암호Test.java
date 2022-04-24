package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 시저암호Test {
    @Test
    public void test1() {
        assertEquals(
                "BC",
                new 시저암호().solution("AB", 1)
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "a",
                new 시저암호().solution("z", 1)
        );
    }

    @Test
    public void test3() {
        assertEquals(
                "e F d",
                new 시저암호().solution("a B z", 4)
        );
    }
}
