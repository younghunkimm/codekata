class Solution {
    public String solution(int n) {
        String waterMelon = "수박";
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(waterMelon.charAt(i % 2));
        }
        
        return result.toString();
    }
}