class Solution {
public:

    void allsub(vector<int>& nums,
                vector<int>& ans,
                int i,
                vector<vector<int>>& subsets) {

        if(i == nums.size()) {
            subsets.push_back(ans);
            return;
        }

        // Include
        ans.push_back(nums[i]);
        allsub(nums, ans, i+1, subsets);

        // Backtrack
        ans.pop_back();

        // Skip duplicates
        int idx = i + 1;
        while(idx < nums.size() && nums[idx] == nums[idx - 1]) {
            idx++;
        }

        allsub(nums, ans, idx, subsets);
    }

    vector<vector<int>> subsetsWithDup(vector<int>& nums) {

        sort(nums.begin(), nums.end());   // sort first

        vector<vector<int>> subsets;
        vector<int> ans;

        allsub(nums, ans, 0, subsets);

        return subsets;
    }
};