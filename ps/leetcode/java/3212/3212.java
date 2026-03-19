class Solution {

    int[][] sx = new int[1001][1001];
    int[][] sy = new int[1001][1001];

    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    sx[i][j] = grid[i][j] == 'X' ? 1 : 0;
                    sy[i][j] = grid[i][j] == 'Y' ? 1 : 0;
                } else {
                    sx[i][j] = sx[i][j - 1] + (grid[i][j] == 'X' ? 1 : 0);
                    sy[i][j] = sy[i][j - 1] + (grid[i][j] == 'Y' ? 1 : 0);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    continue;
                } else {
                    sx[i][j] += sx[i - 1][j];
                    sy[i][j] += sy[i - 1][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (sx[i][j] == sy[i][j] && sx[i][j] > 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
