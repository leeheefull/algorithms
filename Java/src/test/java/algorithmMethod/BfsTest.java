package algorithmMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BfsTest {
    private Bfs bfs;

    @BeforeEach
    void setUp() {
        this.bfs = new Bfs();
    }

    @Test
    void 이동한_횟수_구하기() {
        // given
        int[][] map = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };
        int x = 0;
        int y = 1;

        // when
        int actual = bfs.getMoveCnt(map, x, y);
        int expected = 7;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void 가장_빠르게_미로찾기() {
        // given
        int[][] map = {
                {1, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        int x1 = 0;
        int y1 = 0;
        int x2 = 4;
        int y2 = 5;

        // when
        int actual = bfs.getMoveCntByShortPath(map, x1, y1, x2, y2);
        int expected = 10;

        // then
        assertEquals(expected, actual);
    }
}
