package chapter;

import java.util.Arrays;

public class Chapter7 {
    public int exampleProblem1(int[] lists, int startIndex, int endIndex, int target) {
        if (startIndex > endIndex) {
            return -1;
        }
        int mid = (startIndex + endIndex) / 2;
        if (lists[mid] == target) {
            return mid;
        } else if (lists[mid] > target) {
            return exampleProblem1(lists, startIndex, mid - 1, target);
        } else {
            return exampleProblem1(lists, mid + 1, endIndex, target);
        }
    }

    public void practicalProblem2(int[] storeParts, int[] requestParts) {
        Arrays.sort(storeParts);
        for (int request : requestParts) {
            int result = exampleProblem1(storeParts, 0, storeParts.length - 1, request);
            if (result > 0) {
                System.out.print("yes ");
            } else {
                System.out.print("no ");
            }
        }
    }

    private int searchDduk(int[] dducks, int startIndex, int endIndex, int target) {
        if (startIndex > endIndex) {
            return -1;
        }
        int mid = (startIndex + endIndex) / 2;
        int result = 0;
        for (int i = mid; i < dducks.length; i++) {
            result = result + dducks[i] - dducks[mid];
        }
        if (target == result) {
            return mid;
        } else if (target > result) {
            return searchDduk(dducks, startIndex, mid - 1, target);
        } else {
            return searchDduk(dducks, mid + 1, endIndex, target);
        }
    }

    public void practicalProblem3(int[] dducks, int target) {
        Arrays.sort(dducks);
        int result = searchDduk(dducks, 0, dducks.length - 1, target);
        System.out.println(dducks[result]);
    }
}
