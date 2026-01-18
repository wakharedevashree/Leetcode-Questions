class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows=mat.length;
        int cols=mat[0].length;
        int start=0;
        int end=rows*cols-1;
        while(start<=end){
            int mid=(start+end)/2;
            int row=mid/cols;
            int col=mid%cols;
            int ele=mat[row][col];
            if(ele==target){
                return true;
            }
            else if(ele>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}