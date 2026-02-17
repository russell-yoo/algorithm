import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));

        var t = Integer.parseInt(br.readLine());
        var s = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) {
                s.add(br.readLine());
            }
            bw.write(s.size() + "\n");
            s.clear();
        }
        bw.flush();
    }
}
