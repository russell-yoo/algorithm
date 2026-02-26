class Solution {

    boolean[] getBits(String s) {
        boolean[] bits = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            bits[i] = s.charAt(i) == '1';
        }
        return bits;
    }

    public int numSteps(String s) {
        boolean[] bits = getBits(s);
        int steps = 0;
        boolean carry = false;

        for (int i = bits.length - 1; i > 0; i--) {
            // 현재 비트가 1이거나 (0인데 carry가 있으면) 결과적으로 홀수
            if (bits[i] ^ carry) {
                // (bits[i] + carry) % 2 == 1
                carry = true;
                steps += 2;
            } else {
                steps += 1;
            }
        }

        return steps + (carry ? 1 : 0); // 최상위에서 carry 남으면 1번 더 필요
    }
}
