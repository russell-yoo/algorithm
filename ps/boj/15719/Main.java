import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited = new boolean[10101010];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        BufferedWriter bw = new BufferedWriter(
            new OutputStreamWriter(System.out)
        );

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            Integer x = Integer.parseInt(st.nextToken());
            if (visited[x]) {
                bw.write(String.valueOf(x));
                bw.flush();
                System.exit(0);
            }
            visited[x] = true;
        }
    }
}
