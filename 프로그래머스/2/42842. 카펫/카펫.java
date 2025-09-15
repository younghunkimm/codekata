import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        List<int[]> candidates = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(total); i++) {
            if (total % i == 0) {
                int width = total / i;
                int height = i;
                if (width >= height) {
                    candidates.add(new int[]{width, height});
                }
            }
        }

        for (int[] candidate : candidates) {
            int width = candidate[0];
            int height = candidate[1];
            if ((width - 2) * (height - 2) == yellow) {
                return new int[]{width, height};
            }
        }

        return new int[]{};
    }
}