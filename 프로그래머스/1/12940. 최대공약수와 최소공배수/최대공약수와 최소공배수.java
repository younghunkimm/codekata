class Solution {
    public int[] solution(int n, int m) {
        // 두 숫자 중 가장 작은 값보다 작은 값에서 두 수 모두 나눠 떨어지는 수
        int result1 = 0;
        int min = Math.min(n, m);
        for (int i = min; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                result1 = i;
                break;
            }
        }
        
        // 두 숫자를 2씩 곱해서 같은 수가 되는 최소값
        int result2 = 0;
        int limit = n * m;
        int init = Math.max(n, m);
        for (int j = init; j <= limit; j++) {
            if (j % n == 0 && j % m == 0) {
                result2 = j;
                break;
            }
        }
        
        return new int[] {result1, result2};
    }
}