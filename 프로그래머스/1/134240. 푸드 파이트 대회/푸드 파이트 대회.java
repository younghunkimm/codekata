class Solution {
    public String solution(int[] food) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i];
            int oneSide = cnt / 2;

            if (oneSide > 0) {
                for (int j = 0; j < oneSide; j++) {
                    result.append(i);
                }
            }
        }
        StringBuilder copyResult = new StringBuilder(result.toString());
        result.append(0);

        result.append(copyResult.reverse().toString());
        
        return result.toString();
    }
}