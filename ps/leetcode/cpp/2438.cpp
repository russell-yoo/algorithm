#include<bits/stdc++.h>

using namespace std;


class Solution {
    const long long int mod = 1e9+7;
public:
    int pw(int n) {
        if(n == 0) {
            return 1;
        }
        if(n&1) {
            int result = pw(n/2);
            return ((((result%mod) * (result%mod))%mod)*2)%mod;

        }else{
            int result = pw(n/2);
            return ((((result%mod) * (result%mod))%mod))%mod;
        }
    }
    vector<int> productQueries(int n, vector<vector<int>>& queries) {
        vector<int> powers;
        int tmp = 0;
        while(n) {
            cout << n <<endl;
            if(n&1) {
                powers.push_back(tmp);
            }
            tmp++;
            n>>=1;
        }
        
        vector<int> nums;
        for(int i=0; i<powers.size(); i++){
            if(i == 0) {
                nums.push_back(powers[i]);
            }else {
                nums.push_back(nums[i-1] + powers[i]);
            }
        }

        vector<int> answer;

        for(int i=0; i<queries.size(); i++){
            int from = queries[i][0];
            int to = queries[i][1];

            int result = nums[to];
            if(from-1 >=0) {
                result -= nums[from-1];
            }
            answer.push_back(pw(result));
        }
        return answer;

        
    }
};