import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        final int DAYS = 10;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int answer = 0;
        for (int i = 0; i <= discount.length - DAYS; i++) {
            Map<String, Integer> tempMap = new HashMap<>(map);

            for (int j = i; j < i + DAYS; j++) {
                if (tempMap.containsKey(discount[j])) {
                    tempMap.put(discount[j], tempMap.get(discount[j]) - 1);
                    if (tempMap.get(discount[j]) == 0) {
                        tempMap.remove(discount[j]);
                    }
                }
            }

            if (tempMap.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}