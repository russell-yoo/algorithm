class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (equals(mat, target)) {
                return true;
            }
            mat = rotate(mat);
        }
        return false;
    }

    private boolean equals(int[][] a, int[][] b) {
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] rotate(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j][n - 1 - i] = mat[i][j];
            }
        }
        return res;
    }
}
