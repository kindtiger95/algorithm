package chapter;

public class Chapter4 {
    public int[] example1(int n, String[] commands) {
        int[] cp = {0, 0};
        for (String s : commands) {
            int[] move = move(s);
            int[] predict = new int[]{ cp[0] + move[0], cp[1] + move[1] };
            if (isPossible(n, predict)) {
                cp = predict;
            }
        }
        cp[0] += 1;
        cp[1] += 1;
        return cp;
    }

    private int[] move(String s) {
        switch (s) {
            case "U":
                return new int[]{-1, 0};
            case "R":
                return new int[]{0, 1};
            case "D":
                return new int[]{1, 0};
            default:
                return new int[]{0, -1};
        }
    }

    private boolean isPossible(int mapSize, int[] predict) {
        int nextX = predict[0];
        int nextY = predict[1];
        return nextX >= 0 && nextX < mapSize && nextY >= 0 && nextY < mapSize;
    }

    public int example2(int n) {
        int[] clock = { 0, 0, 0 };
        int count = 0;
        while (clock[0] <= n) {
            if (Integer.toString(clock[0]).contains("3")) {
                count++;
            } else if (Integer.toString(clock[1]).contains("3")) {
                count++;
            } else if (Integer.toString(clock[2]).contains("3")) {
                count++;
            }
            nextTime(clock);
        }
        return count;
    }

    private void nextTime(int[] clock) {
        clock[2]++;
        if (clock[2] == 60) {
            clock[2] = 0;
            clock[1]++;
        }
        if (clock[1] == 60) {
            clock[1] = 0;
            clock[0]++;
        }
    }
}
