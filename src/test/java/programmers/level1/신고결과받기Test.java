package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 신고결과받기Test {
    private 신고결과받기 test;

    @BeforeEach
    void setUp() {
        test = new 신고결과받기();
    }

    @Test
    void test1() {
        // given
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        // when
        int[] actual = test.solution(idList, report, k);
        int[] expected = {2, 1, 1, 0};

        // then
        assertArrayEquals(expected, actual);
    }

    @Test
    void test2() {
        // given
        String[] idList = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        // when
        int[] actual = test.solution(idList, report, k);
        int[] expected = {0, 0};

        // then
        assertArrayEquals(expected, actual);
    }
}
