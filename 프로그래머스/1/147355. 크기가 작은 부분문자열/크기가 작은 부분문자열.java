class Solution {
    public int solution(String t, String p) {
        int pLength = p.length();

        int answer = 0;
        for (int i = 0; i < t.length() - (pLength - 1); i++) {
            StringBuilder tStr = new StringBuilder();
            for (int j = 0; j < pLength; j++) {
                tStr.append(t.charAt(i + j));
            }

            Long tNum = Long.valueOf(tStr.toString());
            Long pNum = Long.valueOf(p);

            if (tNum.compareTo(pNum) <= 0) answer++;
        }
        
        return answer;
    }
}