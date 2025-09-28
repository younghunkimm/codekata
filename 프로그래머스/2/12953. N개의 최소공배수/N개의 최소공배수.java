import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        return Arrays.stream(arr)
            // 최소공배수(LCM) 계산
            // 두 수의 최소공배수는 두 수를 곱한 후 최대공약수(GCD)로 나눈 값
            .reduce((a, b) -> a * b / gcd(a, b))
            .orElse(0);
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}