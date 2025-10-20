package chapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter5Test {
    private final Chapter5 chapter5 = new Chapter5();

    @Test
    public void exampleProblem1Test() {
        boolean[][] grape = new boolean[9][9];
        grape[1][2] = true;
        grape[1][3] = true;
        grape[1][8] = true;
        grape[2][1] = true;
        grape[2][7] = true;
        grape[3][1] = true;
        grape[3][4] = true;
        grape[3][5] = true;
        grape[4][3] = true;
        grape[4][5] = true;
        grape[5][3] = true;
        grape[5][4] = true;
        grape[6][7] = true;
        grape[7][2] = true;
        grape[7][6] = true;
        grape[7][8] = true;
        grape[8][1] = true;
        grape[8][7] = true;
        chapter5.exampleProblem1(grape);
    }

    @Test
    public void exampleProblem2Test() {
        boolean[][] graph = new boolean[9][9];
        graph[1][2] = true;
        graph[1][3] = true;
        graph[1][8] = true;
        graph[2][1] = true;
        graph[2][7] = true;
        graph[3][1] = true;
        graph[3][4] = true;
        graph[3][5] = true;
        graph[4][3] = true;
        graph[4][5] = true;
        graph[5][3] = true;
        graph[5][4] = true;
        graph[6][7] = true;
        graph[7][2] = true;
        graph[7][6] = true;
        graph[7][8] = true;
        graph[8][1] = true;
        graph[8][7] = true;
        chapter5.exampleProblem2(graph);
    }

    @Test
    public void practicalProblem3Test() {
        int[][] graph = {
                {0,0,1,1,0},
                {0,0,0,1,1},
                {1,1,1,1,1},
                {0,0,0,0,0}
        };
        int result = chapter5.practicalProblem3(graph);
        Assertions.assertEquals(result, 3);

        int[][] grap2 = {
                {0,0,0,0,0,1,1,1,1,0,0,0,0,0},
                {1,1,1,1,1,1,0,1,1,1,1,1,1,0},
                {1,1,0,1,1,1,0,1,1,0,1,1,1,0},
                {1,1,0,1,1,1,0,1,1,0,0,0,0,0},
                {1,1,0,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,0,1,1,1,1,1,1,1,1,1,0,0},
                {1,1,0,0,0,0,0,0,0,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,0,0,0,0,0,0,0,0,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,0,0,1,1},
                {1,1,1,0,0,0,1,1,1,1,1,1,1,1},
                {1,1,1,0,0,0,1,1,1,1,1,1,1,1}
        };
        int resul2 = chapter5.practicalProblem3(grap2);
        Assertions.assertEquals(resul2, 8);
    }

    @Test
    public void practicalProblem4Test() {
        int[][] graph = {
                {1,0,1,0,1,0},
                {1,1,1,1,1,1},
                {0,0,0,0,0,1},
                {1,1,1,1,1,1},
                {1,1,1,1,1,1}
        };
        int result = chapter5.practicalProblem4(graph);
        Assertions.assertEquals(result, 10);
    }
}