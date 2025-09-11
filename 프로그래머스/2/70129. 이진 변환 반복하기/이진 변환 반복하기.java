class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int zeroCount = 0;
        int conversionCount = 0;
        while (!s.equals("1")) {
            for (char c : s.toCharArray()) {
                if (c == '0') zeroCount++;
            }
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            conversionCount++;
        }

        answer[0] = conversionCount;
        answer[1] = zeroCount;

        return answer;
    }
}