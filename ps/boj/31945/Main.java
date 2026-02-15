import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        var bf = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bf.readLine());
        for (int i = 0; i < t; i++) {
            int a = 0,
                b = 0,
                c = 0,
                d = 0;
            String[] input = bf.readLine().split(" ");
            Arrays.sort(input);
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    a = Integer.parseInt(input[j]);
                } else if (j == 1) {
                    b = Integer.parseInt(input[j]);
                } else if (j == 2) {
                    c = Integer.parseInt(input[j]);
                } else {
                    d = Integer.parseInt(input[j]);
                }
            }
            if (a == 0 && b == 1 && c == 2 && d == 3) {
                bw.write("YES\n");
            } else if (a == 4 && b == 5 && c == 6 && d == 7) {
                bw.write("YES\n");
            } else if (a == 0 && b == 1 && c == 4 && d == 5) {
                bw.write("YES\n");
            } else if (a == 0 && b == 2 && c == 4 && d == 6) {
                bw.write("YES\n");
            } else if (a == 1 && b == 3 && c == 5 && d == 7) {
                bw.write("YES\n");
            } else if (a == 2 && b == 3 && c == 6 && d == 7) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
