class Solution {
    public int[] solution(int n, int m) {
        int[] gcdlcm = new int[2];
        
        // 유클리드 호제법
        gcdlcm[0] = gcd(n, m);
        gcdlcm[1] = n * m / gcdlcm[0];
        
        return gcdlcm;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}