class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            String substring = s.substring(0, i);
            String reverseStr = new StringBuffer(substring).reverse().toString();

            int offset = reverseStr.indexOf(c);
            result[i] = offset >= 0 ? offset + 1 : offset;
        }
        
        return result;
    }
}