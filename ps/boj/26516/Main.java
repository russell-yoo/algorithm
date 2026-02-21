import java.io.*;
import java.util.*;

public class Main {

    static int pw(int x) {
        if (x <= 0) {
            return 1;
        }
        return 10 * pw(x - 1);
    }

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            int maxIdx = -1;
            int maxValue = -1;
            for (int i = 0; i < input.length(); i++) {
                int k = input.charAt(i) - '0';
                if (k > maxValue) {
                    maxValue = k;
                    maxIdx = i;
                }
            }
            int result = 0;
            for (int i = 0; i < input.length(); i++) {
                int k = input.charAt(i) - '0';
                if (i == maxIdx) {
                    if (k % 2 == 0) {
                        k = (k + 4) % 10;
                    } else {
                        k = 0;
                    }
                    result += pw(input.length() - i - 1) * k;
                } else {
                    result += pw(input.length() - i - 1) * k;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
    }
}
