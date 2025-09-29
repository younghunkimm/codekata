class Solution {
    public long solution(int n) {
        final int MOD = 1_234_567;
        
        if (n == 1) return 1;
        if (n == 2) return 2;

        long a = 1;
        long b = 2;
        long temp = 0;

        for (int i = 3; i <= n; i++) {
            temp = (a + b) % MOD;
            a = b;
            b = temp;
        }

        return b;
    }
}