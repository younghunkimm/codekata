class Solution {
    public boolean solution(int x) {
        String xStr = String.valueOf(x);
        boolean isHarshad = false;
        
        // 각 자릿수 합 구하기
        int sum = 0;
        for (int i = 0; i < xStr.length(); i++) {
            int c = xStr.charAt(i) - 48;
            sum += c;
        }
        
        try {
            if (x % sum == 0) {
                isHarshad = true;
            }
        } catch (ArithmeticException e) {
            e.getStackTrace();   
        }
        
        return isHarshad;
    }
}