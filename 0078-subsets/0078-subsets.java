class Solution {
    private void backtrack( List<List<Integer>> res,List<Integer> set,int[] nums,int start){

        res.add(new ArrayList<>(set));
        
        for(int i=start;i<nums.length;i++){
            set.add(nums[i]);
            backtrack(res,set,nums,i+1);
            set.remove(set.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0);

        return res;
    }
}