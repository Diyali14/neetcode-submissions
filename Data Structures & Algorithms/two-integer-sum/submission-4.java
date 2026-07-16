class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length;
       int[] ar=new int[2];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        if(map.containsKey(target-nums[i])){
            ar[0]=map.get(target-nums[i]);
            ar[1]=i;
            return ar;
        }
        else{
            map.put(nums[i],i);
        }
       }
       return ar;
    }
}
