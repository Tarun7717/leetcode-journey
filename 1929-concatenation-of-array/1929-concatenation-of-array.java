class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int idx=0;
        int n=nums.length+nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[idx++];
            if(idx==nums.length){
                idx=0;
            }
        }
        return ans;
    }
}