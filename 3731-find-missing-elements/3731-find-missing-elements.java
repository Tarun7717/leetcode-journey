class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        List<Integer> res = new ArrayList<>();

        int min=Integer.MAX_VALUE;
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            min=Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }

        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }

        return res;
    }
}