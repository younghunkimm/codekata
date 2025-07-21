class Solution {
    public boolean solution(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        if (!(s.length() == 4 || s.length() == 6)) return false;
        return true;
    }
}