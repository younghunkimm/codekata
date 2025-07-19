class Solution {
    public String solution(String s) {
        int first = (s.length() - 1) / 2;
        int second = s.length() / 2 + 1;

        return s.substring(first, second);
    }
}