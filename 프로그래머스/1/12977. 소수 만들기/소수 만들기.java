class Solution {
    public int solution(int[] nums) {
        int limit = 3;

        int answer = 0;
        for (int i = 0; i <= nums.length - limit; i++) {
            for (int j = i + 1; j <= nums.length - limit + 1; j++) {
                for (int k = j + 1; k <= nums.length - limit + 2; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}