class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        int[][] countArray = new int[2][10];

        for (String x : X.split("")) countArray[0][Integer.parseInt(x)]++;
        for (String y : Y.split("")) countArray[1][Integer.parseInt(y)]++;

        for (int i = 9; i >= 0; i--) {
            while (countArray[0][i] > 0 && countArray[1][i] > 0) {
                sb.append(i);

                countArray[0][i]--;
                countArray[1][i]--;
            }
        }

        String result = sb.toString();

        if ("".equals(result)) return "-1";
        if ("0".equals(result.substring(0, 1))) return "0";
        
        return result;
    }
}