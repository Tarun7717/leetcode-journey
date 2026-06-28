class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        
        long res=0;

        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=n-k;i--){
            if(mul!=0){
                res+=(long)nums[i]*mul;
                mul--;
            }else{
                res+=nums[i];
            }
        }
        return res;
    }
}
