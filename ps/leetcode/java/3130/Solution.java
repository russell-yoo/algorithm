class Solution {

    private static final int MOD = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][] endWithZero = new long[zero + 1][one + 1];
        long[][] endWithOne = new long[zero + 1][one + 1];

        for (int i = 1; i <= Math.min(zero, limit); i++) {
            endWithZero[i][0] = 1;
        }
        for (int j = 1; j <= Math.min(one, limit); j++) {
            endWithOne[0][j] = 1;
        }

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {
                long z = endWithZero[i - 1][j] + endWithOne[i - 1][j];
                if (i - limit - 1 >= 0) {
                    z -= endWithOne[i - limit - 1][j];
                }
                endWithZero[i][j] = mod(z);

                long o = endWithZero[i][j - 1] + endWithOne[i][j - 1];
                if (j - limit - 1 >= 0) {
                    o -= endWithZero[i][j - limit - 1];
                }
                endWithOne[i][j] = mod(o);
            }
        }

        return (int) ((endWithZero[zero][one] + endWithOne[zero][one]) % MOD);
    }

    private long mod(long x) {
        x %= MOD;
        if (x < 0) {
            x += MOD;
        }
        return x;
    }
}
