import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {        
        // 1. for
        // int answer = 0;
        // for (int i = 2; i < n; i++) {
        //     if (n % i == 1) {
        //         answer = i;
        //         break;
        //     }
        // }
        // return answer;
        
        // 2. while 1
        // int answer = 1;
        // while (true) {
        //     if (n % answer == 1) break;
        //     answer++;
        // }
        // return answer;
        
        // 2. while 2
        // int answer = 1;
        // while (n % answer != 1) {
        //     answer++;
        // }
        // return answer;
        
        // 3. stream
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }
}