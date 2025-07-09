class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        answer = (double) sum / numbers.length;
        
        // Stream
        // return Arrays.stream(numbers).average().orElse(0);
        
        return answer;
    }
}