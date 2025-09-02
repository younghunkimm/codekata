import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] todayYMD = today.split("\\.");
        String todayY = todayYMD[0];
        String todayM = todayYMD[1];
        String todayD = todayYMD[2];
        LocalDate currentDate = LocalDate.of(
            Integer.parseInt(todayY),
            Integer.parseInt(todayM),
            Integer.parseInt(todayD)
        );
        
        Map<String, Integer> termDurationMap = new HashMap<>();
        for (String term : terms) {
            String[] typeDurationArray = term.split(" ");
            String type = typeDurationArray[0];
            int duration = Integer.parseInt(typeDurationArray[1]);
            
            termDurationMap.put(type, duration);
        }
        
        List<Integer> expiredList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] datePrivacyArray = privacies[i].split(" ");
            String[] dateYMD = datePrivacyArray[0].split("\\.");
            String dateY = dateYMD[0];
            String dateM = dateYMD[1];
            String dateD = dateYMD[2];
            LocalDate privacyDate = LocalDate.of(
                Integer.parseInt(dateY),
                Integer.parseInt(dateM),
                Integer.parseInt(dateD)
            );
            String termType = datePrivacyArray[1];
            int durationMonths = termDurationMap.get(termType);
            LocalDate expiryDate = privacyDate.plusMonths(durationMonths);
            
            if (!expiryDate.isAfter(currentDate)) {
                expiredList.add(i + 1);
            }
        }
        
        return expiredList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}