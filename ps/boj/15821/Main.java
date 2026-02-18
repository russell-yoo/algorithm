import java.io.*;
import java.util.*;

public class Main {

    public static long getDistance(long x1, long y1) {
        return x1 * x1 + y1 * y1;
    }

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        var s = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            var pointCount = Integer.parseInt(br.readLine());
            var points = br.readLine().split(" ");
            long longgest = 0;
            for (int j = 0; j < points.length; j += 2) {
                long x = Long.parseLong(points[j]);
                long y = Long.parseLong(points[j + 1]);
                long dist = getDistance(x, y);
                longgest = Math.max(longgest, dist);
            }

            s.add(longgest);
        }

        Collections.sort(s);
        bw.write(String.valueOf(s.get(k - 1)) + ".00");
        bw.flush();
    }
}
