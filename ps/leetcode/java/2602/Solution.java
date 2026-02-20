import java.util.*;

class Solution {

    private long[] prefixSum;

    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        prefixSum = new long[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        List<Long> result = new ArrayList<>();
        for (int query : queries) {
            int index = Arrays.binarySearch(nums, query);
            if (index < 0) {
                // if not found return negative index
                // -index -1 is lower bound
                index = -index - 1;
            }
            long leftSum = prefixSum[index];
            long rightSum = prefixSum[nums.length] - prefixSum[index];
            long leftOps = (long) index * query - leftSum;
            long rightOps = rightSum - (long) (nums.length - index) * query;
            result.add(leftOps + rightOps);
        }

        return result;
    }
}
