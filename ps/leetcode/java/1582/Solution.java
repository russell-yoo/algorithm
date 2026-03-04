import java.util.*;

class Solution {

    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] rows = new int[n];
        int[] cols = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rows[i] += mat[i][j];
                cols[j] += mat[i][j];
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && rows[i] == 1 && cols[j] == 1) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
