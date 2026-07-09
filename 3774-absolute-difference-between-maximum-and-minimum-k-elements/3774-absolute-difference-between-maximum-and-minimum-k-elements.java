class Solution {
    public int absDifference(int[] nums, int k) {
        

        if(nums.length==1){
            return 0;
        }

        int minSum=0;
        int maxSum=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            minSum+=nums[i];
        }
        int n=nums.length;
        for(int i=n-1;i>n-k-1;i--){
             maxSum+=nums[i];
        }   
        System.out.println(minSum+" "+maxSum);
        return Math.abs(maxSum-minSum);
    }
}