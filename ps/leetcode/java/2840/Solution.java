class Solution {

    int[] odd1 = new int[26];
    int[] even1 = new int[26];
    int[] odd2 = new int[26];
    int[] even2 = new int[26];

    public boolean checkStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                odd1[s1.charAt(i) - 'a']++;
                odd2[s2.charAt(i) - 'a']++;
            } else {
                even1[s1.charAt(i) - 'a']++;
                even2[s2.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (odd1[i] != odd2[i]) {
                return false;
            }
            if (even1[i] != even2[i]) {
                return false;
            }
        }

        return true;
    }
}
