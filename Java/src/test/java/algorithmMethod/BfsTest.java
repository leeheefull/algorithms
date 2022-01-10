package algorithmMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        boolean[][] visited = new boolean[map.length][map[0].length];

        // when
        int actual = bfs.bfs(map, visited, 0, 1);
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

        // when
        int actual = bfs.bfs(map);
        int expected = 10;

        // then
        assertEquals(expected, actual);
    }
}
