import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] answers) {
        int[] pattern1 = { 1, 2, 3, 4, 5 };
        int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] pattern3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        Map<Integer, Integer> spj = new HashMap<>();
        spj.put(1, 0);
        spj.put(2, 0);
        spj.put(3, 0);

        for (int i = 0; i < answers.length; i++) {
            if (pattern1[i % pattern1.length] == answers[i]) spj.put(1, spj.get(1) + 1);
            if (pattern2[i % pattern2.length] == answers[i]) spj.put(2, spj.get(2) + 1);
            if (pattern3[i % pattern3.length] == answers[i]) spj.put(3, spj.get(3) + 1);
        }

        int max = Collections.max(spj.values());
        return spj.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}