import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        for (int i = score.length - 1; i >= m - 1; i -= m) {
            answer += score[i - m + 1] * m;
        }
        
        return answer;
    }
}