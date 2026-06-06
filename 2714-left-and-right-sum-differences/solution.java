class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int n=nums.length;
        int[] leftSum=new int[n];
        int[] rightSum=new int[n];
        int[] ans=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];  
            leftSum[i]=sum-nums[i];
        }

        sum=0;
        for(int j=n-1;j>=0;j--){
            sum+=nums[j];
            rightSum[j]=sum-nums[j];
        }

        for(int k=0;k<n;k++){
            ans[k]=Math.abs(leftSum[k]-rightSum[k]);
        }
        return ans;
    }
}
