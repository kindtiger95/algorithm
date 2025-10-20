package chapter;

import java.util.Arrays;

public class Chapter3 {
    public int exampleProblem1(int n) {
        int result = 0;
        int remain = n;
        int[] coins = new int[]{ 500, 100, 50, 10 };
        for (int coin : coins) {
            if (remain == 0) {
                break;
            }
            result += remain / coin;
            remain = remain % coin;
        }
        return result;
    }

    public int practicalProblem3(int m, int k, int[] lists) {
        int result = 0;
        int count = 0;
        Arrays.sort(lists);
        for (int i = 0; i < m; i++) {
            if (count == k) {
                count = 0;
                result += lists[lists.length - 2];
            } else {
                count++;
                result += lists[lists.length - 1];
            }
        }
        return result;
    }

    public int practicalProblem2_2(int m, int k, int[] lists) {
        Arrays.sort(lists);
        int bundle = lists[lists.length - 1] * k + lists[lists.length - 2];
        return m / (k + 1) * bundle + (m % (k + 1) * lists[lists.length - 1]);
    }

    public int practicalProblem3(int[][] lists) {
        int[] candidate = new int[lists.length];
        for (int i = 0; i < lists.length; i++) {
            candidate[i] = Arrays.stream(lists[i]).min().getAsInt();
        }
        return Arrays.stream(candidate).max().getAsInt();
    }

    public int practicalProblem4(int N, int K) {
        int result = 0;
        while (N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            result++;
        }
        return result;
    }

    public int practicalProblem4_2(int N, int K) {
        int result = 0;
        while (N != 1) {
            int remain = N % K;
            if (remain == 0) {
                N /= K;
                result++;
            } else if (N > remain) {
                N -= remain;
                result += remain;
            } else {
                N--;
                result++;
            }
        }
        return result;
    }
}
