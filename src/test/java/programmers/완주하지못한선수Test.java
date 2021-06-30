package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 완주하지못한선수Test {
    private 완주하지못한선수 test;

    @BeforeEach
    void setUp() {
        test = new 완주하지못한선수();
    }

    @Test
    void test1() {
        // given
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        // when
        String actual = test.solution(participant, completion);
        String expected = "leo";

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        // when
        String actual = test.solution(participant, completion);
        String expected = "vinko";

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test3() {
        // given
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        // when
        String actual = test.solution(participant, completion);
        String expected = "mislav";

        // then
        assertEquals(actual, expected);
    }
}