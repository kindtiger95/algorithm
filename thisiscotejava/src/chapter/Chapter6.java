package chapter;

import java.util.Arrays;

public class Chapter6 {
    public void exampleProblem1(int[] lists) {
        for (int i = 0; i < lists.length; i++) {
            int mostSmall = lists[i];
            int smallIndex = i;
            for (int j = i + 1; j < lists.length; j++) {
                if (mostSmall > lists[j]) {
                    mostSmall = lists[j];
                    smallIndex = j;
                }
            }
            int swap = lists[i];
            lists[i] = mostSmall;
            lists[smallIndex] = swap;
        }

        for (int elem : lists) {
            System.out.print(elem + " ");
        }
    }

    public void exampleProblem2(int[] lists) {
        for (int i = 1; i < lists.length; i++) {
            for (int j = i; j > 0; j--) {
                if (lists[j] < lists[j - 1]) {
                    int swap = lists[j];
                    lists[j] = lists[j - 1];
                    lists[j - 1] = swap;
                } else {
                    break;
                }
            }
        }

        for (int elem : lists) {
            System.out.print(elem + " ");
        }
    }

    public void exampleProblem3(int[] lists, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivot = lists[startIndex];
        int start = startIndex + 1;
        int end = endIndex;
        while (true) {
            while (start < end) {
                if (pivot < lists[start]) {
                    break;
                } else {
                    start++;
                }
            }

            while (start <= end) {
                if (pivot > lists[end]) {
                    break;
                } else {
                    end--;
                }
            }

            if (start < end) {
                int swap = lists[start];
                lists[start] = lists[end];
                lists[end] = swap;
            } else {
               lists[startIndex] = lists[end];
               lists[end] = pivot;
               exampleProblem3(lists, 0, end - 1);
               exampleProblem3(lists, end + 1, endIndex);
               break;
            }
        }
    }

    public void exampleProblem4(int[] lists) {
        int[] countSort = new int[100];
        Arrays.fill(countSort, 0);
        for (int list : lists) {
            countSort[list]++;
        }
        for (int i = 0; i < countSort.length;i++) {
            if (countSort[i] > 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void practicalProblem2(int[] lists) {
        Arrays.sort(lists);
        for (int i = lists.length - 1; i >= 0; i--) {
            System.out.print(lists[i] + " ");
        }
    }
}
