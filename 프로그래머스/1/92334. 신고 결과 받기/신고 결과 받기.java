import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            indexMap.put(id_list[i], i);
        }

        // 피신고자 -> 신고한 사람 목록 (중복 방지 위해 List 내 contains 체크)
        Map<String, List<String>> reportersOf = new HashMap<>();
        for (String r : report) {
            String[] parts = r.split(" ");
            String from = parts[0];
            String to = parts[1];
            List<String> list = reportersOf.computeIfAbsent(to, key -> new ArrayList<>());
            if (!list.contains(from)) {
                list.add(from);
            }
        }

        int[] answer = new int[id_list.length];
        for (Map.Entry<String, List<String>> e : reportersOf.entrySet()) {
            List<String> reporters = e.getValue();
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    answer[indexMap.get(reporter)]++;
                }
            }
        }
        return answer;

    }
}