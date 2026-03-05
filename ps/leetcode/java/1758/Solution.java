class Solution {

    public int minOperations(String s) {
        int answer = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1 && s.charAt(i) == '0') {
                k++;
                continue;
            }
            if (i % 2 == 0 && s.charAt(i) == '1') {
                k++;
                continue;
            }
        }
        answer = Math.max(answer, k);
        k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1 && s.charAt(i) == '1') {
                k++;
                continue;
            }
            if (i % 2 == 0 && s.charAt(i) == '0') {
                k++;
                continue;
            }
        }
        answer = Math.max(answer, k);
        return answer;
    }
}
