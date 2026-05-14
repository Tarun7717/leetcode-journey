class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int diff=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==1 && nums[j]==2){
                    diff=Math.abs(i-j);
                    min=Math.min(diff,min);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
