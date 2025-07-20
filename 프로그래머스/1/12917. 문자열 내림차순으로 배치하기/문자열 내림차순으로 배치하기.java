import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars().boxed()
                .sorted((i, j) -> i < j ? 1 : -1)
                .map(i -> String.valueOf((char) i.intValue()))
                .collect(Collectors.joining());
    }
}