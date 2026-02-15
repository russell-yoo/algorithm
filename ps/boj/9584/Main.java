import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String code = br.readLine();
        Integer t = Integer.parseInt(br.readLine());
        var answer = new ArrayList<String>();

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            boolean isOk = true;
            for (int j = 0; j < input.length(); j++) {
                if (code.charAt(j) == '*') {
                    continue;
                } else {
                    if (code.charAt(j) == input.charAt(j)) {
                        continue;
                    } else {
                        isOk = false;
                        break;
                    }
                }
            }
            if (isOk) {
                answer.add(input);
            }
        }
        bw.write(String.valueOf(answer.size()) + "\n");
        for (String s : answer) {
            bw.write(s + "\n");
        }
        bw.flush();
    }
}
