class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;

        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[low++]=nums[i];
            }else{
                ans[high--]=nums[i];
            }
        }
        return ans;
    }
}
