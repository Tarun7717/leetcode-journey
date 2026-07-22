class Solution {

    public void backtrack(List<List<Integer>> res, ArrayList<Integer> list,int[] nums){
        
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        

        for(int num : nums){
            if(list.contains(num)){
                continue;
            }
            list.add(num);
            backtrack(res,list,nums);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();

        backtrack(res,new ArrayList<>(),nums);

        return res;
    }
}