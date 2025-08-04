class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int refill = n / a * b;
            int remainder = n % a;
            
            answer += refill;
            n = refill + remainder;
        }
        
        return answer;
    }
}