class Solution {
    public int solution(int num) {
        int count = 0;
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            
            if (++count >= 400) {
                count = -1;
                break;
            }
        }

        return count;
    }
}