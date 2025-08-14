class Solution {
    public int solution(String[] babbling) {
        String[] word = { "aya", "ye", "woo", "ma" };

        int answer = 0;
        for (String bab : babbling) {
            for (String w : word) {
                if (bab.contains(new StringBuilder(w + w).toString())) break;

                if (bab.contains(w)) {
                    bab = bab.replace(w, "-");
                }
            }

            bab = bab.replace("-", "");
            if (bab.isEmpty()) answer++;
        }
        
        return answer;
    }
}