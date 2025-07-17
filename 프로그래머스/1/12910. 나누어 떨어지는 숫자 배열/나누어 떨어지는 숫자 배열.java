import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = IntStream.of(arr).boxed().collect(Collectors.toList());
        
        boolean isPresent = arrList.stream().anyMatch(x -> x % divisor == 0);

        int[] result;
        if (isPresent) {
            result = arrList.stream().filter(x -> x % divisor == 0).mapToInt(x -> x).sorted().toArray();
        } else {
            result = new int[] { -1 };
        }
        
        return result;
    }
}