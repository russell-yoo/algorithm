class Solution {

    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int maxGap = 0;
        int lastOneIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (lastOneIndex != -1) {
                    maxGap = Math.max(maxGap, i - lastOneIndex);
                }
                lastOneIndex = i;
            }
        }
        return maxGap;
    }
}
