import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = 0;
        int b = 0;
        HashSet<Integer> aSet = new HashSet<>();
        HashSet<Integer> bSet = new HashSet<>();
        while (true) {
            a = random.nextInt(10000) + 1;
            while (aSet.contains(a)) {
                a = random.nextInt(10000) + 1;
            }
            aSet.add(a);
            System.out.println("? A " + a);

            int resp = sc.nextInt();
            if (resp == 1) {
                break;
            }
        }

        while (true) {
            b = random.nextInt(10000) + 1;
            while (bSet.contains(b)) {
                b = random.nextInt(10000) + 1;
            }
            bSet.add(b);
            System.out.println("? B " + b);

            int resp = sc.nextInt();
            if (resp == 1) {
                break;
            }
        }
        System.out.println("! " + (a + b));
    }
}
