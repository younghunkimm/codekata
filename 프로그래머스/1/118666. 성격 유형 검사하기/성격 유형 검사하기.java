import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = initScores();

        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];

            if (choice < 4) { // 비동의
                int score = 4 - choice;
                char type = s.charAt(0);
                scores.put(type, scores.get(type) + score);
            } else if (choice > 4) { // 동의
                int score = choice - 4;
                char type = s.charAt(1);
                scores.put(type, scores.get(type) + score);
            }
        }

        StringBuilder result = new StringBuilder();
        result.append(scores.get('R') >= scores.get('T') ? 'R' : 'T');
        result.append(scores.get('C') >= scores.get('F') ? 'C' : 'F');
        result.append(scores.get('J') >= scores.get('M') ? 'J' : 'M');
        result.append(scores.get('A') >= scores.get('N') ? 'A' : 'N');

        return result.toString();
    }
    
    private Map<Character, Integer> initScores() {
        return new HashMap<>(
                Map.of(
                        'R', 0,
                        'T', 0,
                        'C', 0,
                        'F', 0,
                        'J', 0,
                        'M', 0,
                        'A', 0,
                        'N', 0
                )
        );
    }
}