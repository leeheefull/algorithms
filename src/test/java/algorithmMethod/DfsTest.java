package algorithmMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DfsTest {
    private Dfs dfs;

    @Test
    void dfs() {
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
        this.dfs = new Dfs(map);

        // when
        int[][] actual = dfs.spread(0, 1);
        int[][] expected = {
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        // then
        assertArrayEquals(expected, actual);
    }
}
