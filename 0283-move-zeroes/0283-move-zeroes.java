class Solution {
    public void moveZeroes(int[] nums) {
         int count=0;
	    for(int i=0;i<nums.length;i++){
	       if(nums[i]!=0){
	           count++;
	           
	       }
	   }
	   int[] target = new int[count];
	   int j=0;
	   for(int i=0;i<nums.length;i++){
	       if(nums[i]!=0){
	           target[j] = nums[i];
	           j++;
	       }
	       
	   }
	  for(int i1=0;i1<target.length;i1++){
	      nums[i1] = target[i1];
	  }
	  for(int j1=target.length;j1<nums.length;j1++){
	      nums[j1] =0;
	  }
        
    }
}