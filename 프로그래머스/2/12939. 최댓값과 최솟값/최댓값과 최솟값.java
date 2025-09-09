class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String str : split) {
            int num = Integer.parseInt(str);

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        StringBuilder result = new StringBuilder();
        result.append(min);
        result.append(" ");
        result.append(max);

        return result.toString();
    }
}