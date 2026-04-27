class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int j=1;j<=n;j++){
            if(!set.contains(j)){
                res.add(j);
            }
        }
        return res;
    }
}
