import java.util.stream.IntStream;

class Solution {
    public String solution(String s) {
        StringBuilder sBuilder = new StringBuilder();
        String[] split = s.split("");

        int j = 0;
        for (int i = 0; i < split.length; i++) {
            if (j % 2 == 0) sBuilder.append(split[i].toUpperCase());
            else sBuilder.append(split[i].toLowerCase());

            if (" ".equals(split[i])) j = 0;
            else j++;
        }
        
        return sBuilder.toString();
    }
}