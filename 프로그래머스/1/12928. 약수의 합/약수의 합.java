import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer += n % i == 0 ? i : 0;
        }
        
        return answer;
        
        // return IntStream.rangeClosed(1, n).filter(i->n % i == 0).sum();
    }
}