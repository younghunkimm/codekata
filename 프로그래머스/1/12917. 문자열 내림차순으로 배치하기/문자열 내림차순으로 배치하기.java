import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();

        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());

        for (String str : split) {
            result.append(str);
        }
        
        return result.toString();
    }
}