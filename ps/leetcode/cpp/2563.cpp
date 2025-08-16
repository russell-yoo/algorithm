#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    long long countFairPairs(vector<int>& nums, int lower, int upper) {
        sort(nums.begin(), nums.end());
        long long int result = 0LL;
        
        for(int i=0; i<nums.size(); i++){
            int target = nums[i];

            int right = upper_bound(nums.begin() + i + 1, nums.end(), upper - target) - nums.begin();
            int left = lower_bound(nums.begin() + i + 1, nums.end(), lower - target) - nums.begin();

            if(right >=left) {
                result += (right - left);
            }

        }
        return result;
    }
};