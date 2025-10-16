import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        // 1. 종류별 개수 카운팅
        for (String[] cloth : clothes) {
            String type = cloth[1].trim();
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 안 입는 경우의 수 포함(+1)하여 곱하기
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        // 3. 모두 안 입는 경우 제외(-1)
        return answer - 1;
    }
}