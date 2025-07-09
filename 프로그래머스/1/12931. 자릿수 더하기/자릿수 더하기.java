import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 반복문 사용
        while (true) {
            answer += n % 10;
            
            if (n < 10) break;
            
            n /= 10;
        }
        
        // 형변환 사용
        // String[] array = String.valueOf(n).split("");
        // for(String s : array){
        //     answer += Integer.parseInt(s);
        // }

        return answer;
    }
}