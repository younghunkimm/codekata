import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
                .sorted((a, b) -> {
                    if (a.charAt(n) == b.charAt(n)) return a.compareTo(b);
                    else return a.charAt(n) - b.charAt(n);
                })
                .collect(Collectors.toList())
                .toArray(new String[0]);
    }
}