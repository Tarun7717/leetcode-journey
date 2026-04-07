class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        Set<Integer> set=new HashSet<>();
        int max=1;

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int count=1;

                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
