import java.util.Arrays;

class Solution {
    public long solution(int a, int b) {
        return betweenSum(a, b);
    }
    
    public long betweenSum(int a, int b) {
        long sum = 0;
        long min = (long) Math.min(a, b);
        long max = (long) Math.max(a, b);
        for (long i = min; i <= max; i++) {
            sum += i;
        }
        
        return sum;
    }
}