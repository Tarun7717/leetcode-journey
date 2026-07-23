class Solution {
    public int maxSubArray(int[] nums) {
        int res=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            res=Math.max(nums[i],res+nums[i]); 
            max=Math.max(max,res);
        }
        return max;
        
    }
}