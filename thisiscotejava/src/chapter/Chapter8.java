package chapter;

import java.util.Arrays;

public class Chapter8 {
    private int[] result = new int[100];

    public int exampleProblem1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (result[n] != 0) {
            return result[n];
        }
        result[n - 1] = exampleProblem1(n - 1);
        result[n - 2] = exampleProblem1(n - 2);
        return result[n - 1] + result[n - 2];
    }

    public int practicalProblem2(int n) {
        int[] result = new int[30001];
        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + 1;
            if (i % 2 == 0) {
                result[i] = Math.min(result[i], result[i / 2] + 1);
            }
            if (i % 3 == 0) {
                result[i] = Math.min(result[i], result[i / 3] + 1);
            }
            if (i % 5 == 0) {
                result[i] = Math.min(result[i], result[i / 5] + 1);
            }
        }
        return result[n];
    }

    public int practicalProblem3(int[] stocks) {
        int[] result = new int[stocks.length];
        result[0] = stocks[0];
        result[1] = stocks[1];
        for (int i = 2; i < stocks.length; i++) {
            result[i] = result[i-2] + stocks[i];
        }
        return Math.max(result[stocks.length - 1], result[stocks.length - 2]);
    }

    // 다시 풀어보기
    public int practicalProblem4(int length) {
        int[] result = new int[length];

        return -1;
    }

    // 다시 풀어보기
    public int practicalProblem5(int[] coins, int target) {
        int[] result = new int[target + 1];
        Arrays.fill(result, 10001);
        for (int coin: coins) {
            result[coin] = 1;
        }
        for (int coin: coins) {
            for (int i = coin; i <= target; i++) {
                if (result[i - coin] != 10001) {
                    result[i] = Math.min(result[i], result[i - coin] + 1);
                }
            }
        }
        return result[target];
    }
}
