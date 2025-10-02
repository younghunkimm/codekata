import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        List<Integer> sizes = new ArrayList<>(map.values());
        sizes.sort(Comparator.reverseOrder());

        for (int size : sizes) {
            k -= size;
            answer++;
            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}