class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int total = 0;
        for (int i = 0; i < absolutes.length; i++) {
            boolean sign = signs[i];
            int absolute = absolutes[i];

            total = sign ? total + absolute : total - absolute;
        }
        
        return total;
    }
}