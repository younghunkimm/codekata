class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;
        String result = "Yes";
        for (String s : goal) {
            boolean flag = false;

            if (cards1Index < cards1.length) {
                if (cards1[cards1Index].equals(s)) {
                    cards1Index++;
                    flag = true;
                }
            }

            if (cards2Index < cards2.length) {
                if (cards2[cards2Index].equals(s)) {
                    cards2Index++;
                    flag = true;
                }
            }

            if (!flag) {
                result = "No";
                break;
            }
        }
        
        return result;
    }
}