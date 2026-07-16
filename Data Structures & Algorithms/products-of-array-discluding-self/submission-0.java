class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ar=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int pro=1;
            for(int j=0;j<nums.length;j++){
                if(j==i)
                    continue;
                pro=pro*nums[j];
            }
            ar[i]=pro;
        }
        return ar;
    }
}
