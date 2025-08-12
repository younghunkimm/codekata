class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int divisorCount = getDivisorCount(i);
            
            if (divisorCount > limit) answer += power;
            else answer += divisorCount;
        }
        
        return answer;
    }
    
    public int getDivisorCount(int n) {
        
        int count = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i * i == n) count++;
                else count += 2;
            }
        }
        
        return count;
    }
}