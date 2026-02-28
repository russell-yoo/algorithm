class Solution {

    int mod = 1000000007;

    public int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(Integer.toBinaryString(i));
        }
        String s = sb.toString();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = (ans * 2 + (s.charAt(i) - '0')) % mod;
        }
        return ans;
    }
}
