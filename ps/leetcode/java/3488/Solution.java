import java.util.*;

class Solution {

    int circularDist(int a, int b, int n) {
        int diff = Math.abs(a - b);
        return Math.min(diff, n - diff);
    }

    int getDist(Map<Integer, List<Integer>> mp, int target, int idx, int sz) {
        List<Integer> list = mp.get(target);

        if (list == null || list.size() == 1) {
            return -1;
        }

        int x = Collections.binarySearch(list, idx);

        int prev = (x - 1 + list.size()) % list.size();
        int next = (x + 1) % list.size();

        int dist1 = circularDist(list.get(prev), idx, sz);
        int dist2 = circularDist(list.get(next), idx, sz);

        return Math.min(dist1, dist2);
    }

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer, List<Integer>> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> result = new ArrayList<>();

        for (int query : queries) {
            int idx = query;
            result.add(getDist(mp, nums[idx], idx, nums.length));
        }

        return result;
    }
}
