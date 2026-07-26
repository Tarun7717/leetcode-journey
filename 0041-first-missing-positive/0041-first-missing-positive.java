class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=0;
        int count=1;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 ){
                continue;
            }
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            if(nums[i]!=count)
            {
                return count;
            }else{
                count++;
            }
        }

        return count;
    }
}