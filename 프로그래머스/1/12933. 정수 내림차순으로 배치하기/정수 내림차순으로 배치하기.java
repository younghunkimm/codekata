import java.util.*;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        
        Character[] digits = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i);
        }
        
        Arrays.sort(digits, Collections.reverseOrder());

        StringBuilder sortedStr = new StringBuilder();
        for (char c : digits) {
            sortedStr.append(c);
        }
        
        long result = Long.parseLong(sortedStr.toString());
        
        return result;
    }
}