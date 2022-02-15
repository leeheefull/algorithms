package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 크레인인형뽑기게임Test {
    private 크레인인형뽑기게임 test;

    @BeforeEach
    void setUp() {
        test = new 크레인인형뽑기게임();
    }

    @Test
    void test1() {
        // given
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        // when
        int expected = 4;
        int actual = test.solution(board, moves);

        // then
        assertEquals(expected, actual);
    }
}
