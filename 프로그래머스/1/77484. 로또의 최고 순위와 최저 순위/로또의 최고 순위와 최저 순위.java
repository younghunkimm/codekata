class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int correct = 0;
        int zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }

            for (int winNum : win_nums) {
                if (winNum == lotto) correct++;
            }
        }

        int highRank = win_nums.length - (correct + zeroCount) + 1;
        int lowRank = win_nums.length - correct + 1;

        answer[0] = Math.min(highRank, win_nums.length);
        answer[1] = Math.min(lowRank, win_nums.length);
        
        return answer;
    }
}