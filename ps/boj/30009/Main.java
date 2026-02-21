import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);
        int lowerBound = x - r;
        int upperBound = x + r;

        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            if (lowerBound < t && t < upperBound) {
                a++;
            }
            if (lowerBound == t || upperBound == t) {
                b++;
            }
        }
        bw.write(a + " " + b);
        bw.flush();
    }
}
