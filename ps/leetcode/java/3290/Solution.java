class Solution {

    long[][] dp = new long[5][101010];
    boolean[][] visited = new boolean[5][101010];

    public long maxScore(int[] a, int[] b) {
        return dfs(a, b, 0, 0);
    }

    long dfs(int[] a, int[] b, int i, int j) {
        if (i == 4) return 0; // 4개 다 선택 완료
        if (j == b.length) return Long.MIN_VALUE; // 더 볼 b가 없음

        if (visited[i][j]) return dp[i][j];
        visited[i][j] = true;

        long res = dfs(a, b, i, j + 1); // 현재 b[j]를 선택 안 함

        long next = dfs(a, b, i + 1, j + 1); // 선택함
        if (next != Long.MIN_VALUE) {
            res = Math.max(res, next + (long) a[i] * b[j]);
        }

        dp[i][j] = res;
        return res;
    }
}
