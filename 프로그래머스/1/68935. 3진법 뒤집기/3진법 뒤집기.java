import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        List<Integer> base3 = convertBaseX(3, n);
        List<Integer> reverseBase3 = arrayReverse(base3);
        int base10 = convertBase10(3, reverseBase3);
        
        return base10;
    }
    
    public static List<Integer> convertBaseX(int x, int n) {
        List<Integer> base = new ArrayList<>();
        
        do {
            base.add(n % 3);
            if (n >= 3 && n / x < x) base.add(n / x);
            n /= x;
        } while (n >= x);
        
        Collections.reverse(base);
        return base;
    }
    
    public static <T> List<T> arrayReverse(List<T> list) {
        List<T> copyList = new ArrayList<>(list);
        Collections.reverse(copyList);

        return copyList;
    }
    
    public static int convertBase10(int x, List<Integer> base) {
        double sum = IntStream.range(0, base.size())
                .mapToDouble(i -> base.get(i) * Math.pow(x, (base.size() - 1) - i))
                .sum();
        return (int) sum;
    }
}