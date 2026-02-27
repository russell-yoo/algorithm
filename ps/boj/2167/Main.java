import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr = new int[300][300];

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());

        for (int t = 0; t < k; t++) {
            int i, j, x, y;
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int r = i - 1; r < x; r++) {
                for (int c = j - 1; c < y; c++) {
                    sum += arr[r][c];
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
    }
}
