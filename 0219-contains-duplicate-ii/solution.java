class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Set<Integer> arr=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>k){
                arr.remove(nums[i-k-1]);
            }
            if(!arr.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
