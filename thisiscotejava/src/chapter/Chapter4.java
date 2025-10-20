package chapter;

public class Chapter4 {
    public String exampleProblem1(String schedule, int mapSize) {
        int[] currentPosition = new int[] { 0, 0 };
        String[] moves = schedule.split(" ");
        for (String move: moves) {
            int[] willBeMove = move(move);
            boolean movable = isMovable(willBeMove, currentPosition, mapSize);
            if (movable) {
                currentPosition[0] += willBeMove[0];
                currentPosition[1] += willBeMove[1];
            }
        }
        return String.format("%s %s",currentPosition[0] + 1, currentPosition[1] + 1);
    }

    private int[] move(String move) {
        switch (move) {
            case "L":
                return new int[]{0, -1};
            case "R":
                return new int[]{0, 1};
            case "U":
                return new int[]{-1, 0};
            default:
                return new int[]{1, 0};
        }
    }

    private boolean isMovable(int[] willBeMove, int[] currentPosition, int mapSize) {
        int X = currentPosition[0] + willBeMove[0];
        int Y = currentPosition[1] + willBeMove[1];
        if (X < 0 || X >= mapSize) {
            return false;
        }
        if (Y < 0 || Y >= mapSize) {
            return false;
        }
        return true;
    }

    public int exampleProblem2(int N) {
        int result = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    boolean isContain = String.format("%02d%02d%02d", i, j, k).contains(String.valueOf(3));
                    if (isContain) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public int practicalProblem2(String currentPosition) {
        int x = currentPosition.charAt(1) - '1';
        int y = currentPosition.charAt(0) - 'a';
        int result = 0;
        for (int[] canMove : canMoveKnight) {
            int moveX = x + canMove[0];
            int moveY = y + canMove[1];
            if (moveX < 0 || moveX > 7 || moveY < 0 || moveY > 7) {
                continue;
            }
            result++;
        }
        return result;
    }

    private final int[][] canMoveKnight = new int[][] { {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2} };

    public int practicalProblem3(int[][] map, int[] position, int see) {
        boolean[][] isVisited = new boolean[map.length][map[0].length];
        int result = 0;
        while (true) {
            int snapshotSee = see;
            for (int i = 0; i < 4; i++) {
                see = turnAround(see);
                int[] movement = movement(see);
                if (beCanMove(movement, isVisited, map, position)) {
                    position[0] += movement[0];
                    position[1] += movement[1];
                    isVisited[position[0]][position[1]] = true;
                    result++;
                    break;
                }
            }
            if (snapshotSee == see) {
                int[] fallbackMovement = fallbackMovement(snapshotSee);
                boolean canBeFallback = canFallback(map, position, fallbackMovement);
                if (canBeFallback) {
                    position[0] += fallbackMovement[0];
                    position[1] += fallbackMovement[1];
                } else {
                    break;
                }
            }
        }
        return result;
    }

    private int turnAround(int see) {
        switch (see) {
            case 0: return 1;
            case 1: return 2;
            case 2: return 3;
            default: return 0;
        }
    }

    private int[] movement(int seeAfterTurnAround) {
        switch (seeAfterTurnAround) {
            case 0: return new int[]{-1, 0};
            case 1: return new int[]{0, -1};
            case 2: return new int[]{1, 0};
            default: return new int[]{0, 1};
        }
    }

    private boolean beCanMove(int[] movement, boolean[][] visited, int[][] map, int[] currentPosition) {
        int x = movement[0] + currentPosition[0];
        int y = movement[1] + currentPosition[1];
        if (x < 0 || x > map.length || y < 0 || y > map[0].length || visited[x][y] || map[x][y] == 1) {
            return false;
        }
        return true;
    }

    private int[] fallbackMovement(int see) {
        switch (see) {
            case 0: return new int[]{1, 0};
            case 1: return new int[]{0, 1};
            case 2: return new int[]{-1, 0};
            default: return new int[]{0, -1};
        }
    }

    private boolean canFallback(int[][] map, int[] currentPosition, int[] fallback) {
        int moveX = fallback[0] + currentPosition[0];
        int moveY = fallback[1] + currentPosition[1];
        if (moveX < 0 || moveX > map.length || moveY < 0 || moveY > map[0].length) {
            return false;
        } else {
            return map[moveX][moveY] == 0;
        }
    }
}
