class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int l=0;
        int r=nums.length-1;
        Arrays.sort(nums);
        int count=0;
        while(l<r){
            int ans=nums[l]+nums[r];
            if(ans==k){
                count++;
                l++;
                r--;
            }else if(ans>k){
                r--;
            }else{
                l++;
            }
        }
        return count;
    }
}
