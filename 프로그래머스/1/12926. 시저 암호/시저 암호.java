class Solution {
    public String solution(String s, int n) {        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') sb.append(" ");

            if (c >= 65 && c <= 90) {
                if (c + n > 90) sb.append((char) (((c + n) % 90) + 65 - 1));
                else sb.append((char) (c + n));
            }
            if (c >= 97 && c <= 122) {
                if (c + n > 122) sb.append((char) (((c + n) % 122) + 97 - 1));
                else sb.append((char) (c + n));
            }
        }

        return sb.toString();
    }
}