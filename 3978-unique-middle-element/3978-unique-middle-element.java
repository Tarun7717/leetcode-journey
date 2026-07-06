class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[nums.length/2]){
                count++;
            }
        }
        return count==1;

    }
}