class Solution {
    static final long MOD = 1000000007;

    public int sequence(int n) {
        long ans = 0;
        long start = 1;

        for (int i = 1; i <= n; i++) {
            long term = 1;

            for (int j = 0; j < i; j++) {
                term = (term * start) % MOD;
                start++;
            }

            ans = (ans + term) % MOD;
        }

        return (int) ans;
    }
}