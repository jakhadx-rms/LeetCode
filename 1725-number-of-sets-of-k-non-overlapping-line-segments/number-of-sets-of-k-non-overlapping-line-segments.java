class Solution {
    public int numberOfSets(int n, int k) {
        long MOD = 1_000_000_007L;
        long ans = 1;
        int N = n + k - 1;
        int R = 2 * k;
        for (int i = 1; i <= R; i++) {
            ans = ans * (N - R + i) % MOD;
            ans = ans * modInverse(i, MOD) % MOD;
        }
        return (int) ans;
    }

    private long modInverse(long x, long mod) {
        return power(x, mod - 2, mod);
    }

    private long power(long x, long n, long mod) {
        long result = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                result = result * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return result;
    }
}