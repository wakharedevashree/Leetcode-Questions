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

        // Include current element
        ans.push_back(nums[i]);
        allsub(nums, ans, i+1, subsets);

        // Exclude current element
        ans.pop_back();
        allsub(nums, ans, i+1, subsets);
    }

    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> subsets;
        vector<int> ans;
        allsub(nums, ans, 0, subsets);
        return subsets;
    }
};