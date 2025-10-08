import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> list = new ArrayList<>();
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            list.add((int) Math.max(row, col) + 1);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}