class Solution {
    public int minMoves(int[] nums) {
        int max=0;

        for(int n : nums){
            max=Math.max(n,max);
        }
        int res=0;

        for(int n:nums){
            res+=max-n;
        }
        return res;
    }
}