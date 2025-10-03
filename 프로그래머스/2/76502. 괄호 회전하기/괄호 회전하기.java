import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        
        for (int i = 0; i < len; i++) {
            if (isCorrect(sb.toString())) answer++;
            
            char firstChar = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(firstChar);
        }
        
        return answer;
    }
    
    public boolean isCorrect(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        List<Character> stack = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) { // 닫는 요소라면
                // stack이 비었거나, stack 마지막 요소가 같은 타입이 아니라면
                if (stack.isEmpty() || stack.get(stack.size() - 1) != map.get(c)) {
                    return false;
                }
                stack.remove(stack.size() - 1); // 여는 요소 제거
            } else { // 여는 요소라면 추가
                stack.add(c);
            }
        }
        
        return stack.isEmpty();
    }
}