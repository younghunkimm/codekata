class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        
        double center = (double) (s.length() - 1) / 2;
        
        if (center % 1 == 0) {
            return sArr[(int) center];
        } else {
            int before = (int) Math.floor(center);
            int after = (int) Math.ceil(center);
            return sArr[before] + sArr[after];
        }
    }
}