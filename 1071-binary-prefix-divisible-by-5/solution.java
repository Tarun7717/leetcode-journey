class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int val=0;
        
        for(int i=0;i<nums.length;i++){
           val = ((val<<1)+nums[i])%5;
           res.add(val==0);
        }
        return res;
    }
}
