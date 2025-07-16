class Solution {
    public long solution(int a, int b) {
        long count = Math.abs(b - a); // 정수 개수
        long sum = ((count + 1) * (a + b)) / 2; // 등차수열 합
        
        return sum;
    }
}