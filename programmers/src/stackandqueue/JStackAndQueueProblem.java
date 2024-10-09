package stackandqueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class JStackAndQueueProblem {
    public int[] solution(int []arr) {
        Queue<Integer> q = new ArrayDeque<>();
        List<Integer> l = new ArrayList<>();
        for (int i : arr) {
            q.add(i);
        }
        l.add(q.poll());
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            if (l.get(l.size() - 1) != poll) {
                l.add(poll);
            }
        }
        int[] result = new int[l.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
