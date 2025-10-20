package chapter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Chapter5 {
    public void exampleProblem1(boolean[][] graph) {
        Stack<Integer> s = new Stack<>();
        boolean[] isVisited = new boolean[graph.length];
        s.push(1);
        isVisited[1] = true;
        while (!s.empty()) {
            Integer peek = s.peek();
            boolean isCheck = false;
            for (int i = 0; i < graph[peek].length; i++) {
                if (graph[peek][i] && !isVisited[i]) {
                    s.push(i);
                    isVisited[i] = true;
                    System.out.println(i);
                    isCheck = true;
                    break;
                }
            }
            if (!isCheck) {
                s.pop();
            }
        }
    }

    public void exampleProblem2(boolean[][] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] isVisited = new boolean[graph.length];
        q.add(1);
        isVisited[1] = true;
        while (!q.isEmpty()) {
            Integer elem = q.poll();
            System.out.println(elem);
            for (int i = 0; i < graph[elem].length; i++) {
                if (graph[elem][i] && !isVisited[i]) {
                    isVisited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public int practicalProblem3(int[][] graph) {
        boolean[][] isVisited = new boolean[graph.length][graph[0].length];
        int result = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (isVisited[i][j] || graph[i][j] == 1) {
                    continue;
                }
                dfs(i, j, isVisited, graph);
                result++;
            }
        }
        return result;
    }

    public void bfs(int startX, int startY, boolean[][] isVisited, int[][] graph) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startX, startY});
        isVisited[startX][startY] = true;
        while (!q.isEmpty()) {
            int[] elems = q.poll();
            for (int i = 0; i < 4; i++) {
                int[] move = movable[i];
                int moveX = move[0] + elems[0];
                int moveY = move[1] + elems[1];
                if (moveX < 0 || moveY < 0 || moveX >= graph.length || moveY >= graph[0].length || graph[moveX][moveY] == 1 || isVisited[moveX][moveY]) {
                    continue;
                }
                q.add(new int[]{moveX, moveY});
                isVisited[moveX][moveY] = true;
            }
        }
    }

    public void dfs(int startX, int startY, boolean[][] isVisited, int[][] graph) {
        Stack<int[]> s = new Stack<>();
        s.push(new int[]{startX, startY});
        isVisited[startX][startY] = true;
        while (!s.empty()) {
            boolean isChecked = false;
            int[] elems = s.peek();
            for (int i = 0; i < movable.length; i++) {
                int moveX = movable[i][0] + elems[0];
                int moveY = movable[i][1] + elems[1];
                if (moveX < 0 || moveY < 0 || moveX >= graph.length || moveY >= graph[0].length || isVisited[moveX][moveY] || graph[moveX][moveY] == 1) {
                    continue;
                }
                isVisited[moveX][moveY] = true;
                s.push(new int[]{moveX, moveY});
                isChecked = true;
                break;
            }
            if (!isChecked) {
                s.pop();
            }
        }
    }

    private final int[][] movable = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public int practicalProblem4(int[][] graph) {
        int[][] countMap = new int[graph.length][graph[0].length];
        boolean[][] isVisited = new boolean[graph.length][graph[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        countMap[0][0] = 1;
        isVisited[0][0] = true;
        while (!q.isEmpty()) {
            int[] elems = q.poll();
            for (int i = 0; i < movable.length; i++) {
                int moveX = movable[i][0] + elems[0];
                int moveY = movable[i][1] + elems[1];
                if (moveX < 0 || moveY < 0 || moveX >= graph.length || moveY >= graph[0].length || graph[moveX][moveY] == 0 || isVisited[moveX][moveY]) {
                    continue;
                }
                isVisited[moveX][moveY] = true;
                countMap[moveX][moveY] = countMap[elems[0]][elems[1]] + 1;
                q.add(new int[]{moveX,moveY});
            }
        }
        return countMap[graph.length - 1][graph[0].length - 1];
    }
}
