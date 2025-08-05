import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int days = score.length;
        
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);

            Collections.sort(list, Collections.reverseOrder());
            Integer min = list.stream()
                    .limit(k)
                    .min(Integer::compareTo)
                    .get();
            result.add(min);

            list = list.subList(0, Math.min(list.size(), k));
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}