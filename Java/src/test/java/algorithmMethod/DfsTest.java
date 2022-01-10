package algorithmMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DfsTest {
    private Dfs dfs;

    @BeforeEach
    void setUp() {
        this.dfs = new Dfs();
    }

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

        // when
        int[][] actual = dfs.dfs(map, 0, 1);
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
