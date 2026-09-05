class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row =0;
        int col = nums[row].length-1;
        while(row<nums.length&&col>=0){
            if(nums[row][col]==target){
                return true;
            }
            if(nums[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        
      return false;  
    }
}