package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class JHashProblem {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            int p = map.getOrDefault(i, 0);
            map.put(i, p + 1);
        }
        HashSet<Integer> currentPonKet = new HashSet<>();
        int takeIt = nums.length / 2;
        int currentCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.size() <= currentPonKet.size() || currentCount >= takeIt) {
                break;
            }
            int pon = entry.getKey();
            if (currentPonKet.contains(pon)) {
                continue;
            }
            currentCount += 1;
            currentPonKet.add(pon);
        }
        return currentPonKet.size();
    }
}
