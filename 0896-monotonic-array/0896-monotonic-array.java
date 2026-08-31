class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dsc = true;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]>nums[i-1]){
                dsc = false;

            }
            if(nums[i]<nums[i-1]){
                inc = false;
            }
        } 
        return inc || dsc;
    }
     
}