package chapter;

import java.util.Arrays;

public class Chapter3 {
    public int practicalSolution1(int n, int m, int k, int[] digits) {
        Arrays.sort(digits);
        int first = digits[digits.length - 1];
        int second = digits[digits.length - 2];
        int count = (m / (k + 1) * k) + (m % (k + 1));
        return (count * first) + ((m - count) * second);
    }

    public int practicalSolution2(int n, int m, int[][] digitDoubleArray) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int currentMin = Arrays.stream(digitDoubleArray[i]).min().getAsInt();
            if (max < currentMin) {
                max = currentMin;
            }
        }
        return max;
    }

    public int practicalSolution3(int n, int k) {
        int count = 0;
        while (n != 1) {
            if (n % k == 0) {
                n = n / k;
                count++;
            } else if (n > k) {
                int minusCount = n - ((n / k) * k);
                n -= minusCount;
                count += minusCount;
            } else {
                n--;
                count++;
            }
        }
        return count;
    }
}
