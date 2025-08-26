class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            for (int j = 0; j < index; j++) {
                ch = (char) (ch + 1);

                if (ch > 'z') {
                    ch = (char) (ch - ('z' - 'a') - 1);
                }
                if (skip.indexOf(ch) >= 0) j--;
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}