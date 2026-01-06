class Solution {

    public int binarySearch(int[] nums, int target,boolean flag){
        int l=0,h=nums.length-1;
        int res=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                res=mid;
                if(flag){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=binarySearch(nums, target,true);
        result[1]=binarySearch(nums, target,false);
        return result;
    }
}