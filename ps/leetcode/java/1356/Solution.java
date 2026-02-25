import java.util.Arrays;

class Solution {

    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr, (int a, int b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return countA == countB ? a - b : countA - countB;
        });
        return arr;
    }
}
