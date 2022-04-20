package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 서울에서김서방찾기Test {
    @Test
    public void test1() {
        // given
        var seoul = new String[]{"Jane", "Kim"};

        // when
        var expected = "김서방은 1에 있다";
        var actual = new 서울에서김서방찾기().solution(seoul);

        // then
        assertEquals(expected, actual);
    }
}
