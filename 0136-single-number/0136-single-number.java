class Solution {
    public int singleNumber(int[] nums) {
        int makeZero =0;
        for(int num:nums){
            makeZero  = makeZero^num;
        }
        return makeZero;
        
    }
}