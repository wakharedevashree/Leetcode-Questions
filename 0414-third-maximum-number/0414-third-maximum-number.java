import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1; // Start with 1 for the maximum element
        
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i + 1]) {
                count++;
            }
            if(count == 3) {
                return nums[i];
            }
        }
        return nums[nums.length - 1]; // Return maximum if less than 3 distinct elements
    }
}