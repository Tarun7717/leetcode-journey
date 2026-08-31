class Solution {
    public int minimumDeletions(int[] nums) {
        

        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex=-1;
        int maxIndex=-1;
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<=min){
                min=nums[i];
                minIndex=i;
            }
        }

        int left=Math.min(minIndex,maxIndex);
        int right=Math.max(minIndex,maxIndex);

        int res1=n-left;
        int res2=right+1;
        int res3=(left+1)+(n-right);

        return Math.min(res1,Math.min(res2,res3));
    }
}










