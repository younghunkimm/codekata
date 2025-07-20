import java.util.stream.IntStream;

class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(x -> {
                    long count = IntStream.rangeClosed(1, x / 2).filter(y -> x % y == 0).count();
                    return (count + 1) % 2 == 0 ? x : x * -1;
                })
                .sum();
    }
}