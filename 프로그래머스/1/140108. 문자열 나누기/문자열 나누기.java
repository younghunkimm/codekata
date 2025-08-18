class Solution {
    public int solution(String s) {
        int result = 0;

        while (s.length() != 0) {
            result++;

            char x = s.charAt(0);
            int equalCount = 0;
            int diffCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (x == s.charAt(i)) equalCount++;
                else diffCount++;

                if (equalCount == diffCount) break;
            }

            s = s.substring(equalCount + diffCount);
        }

        return result;
    }
}