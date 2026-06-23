class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n=nums.length;
      int[] idx=new int[2];
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(nums[i]+nums[j] == target){
                idx[0]=i;
                idx[1]=j;
                return idx;
            }
        }
      }
      return idx;  
    }
}
