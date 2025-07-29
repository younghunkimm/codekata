class Solution {
    public int solution(String s) {
        String[] numNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numNames.length; i++) {
            s = s.replace(numNames[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}