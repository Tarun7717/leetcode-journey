class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        int maxGap=0;
        int gap=0;
        Arrays.sort(nums);
        for(int i=n-1;i>=1;i--){
            gap=nums[i]-nums[i-1];
            maxGap=Math.max(gap,maxGap);
        }

        return maxGap;
    }
}