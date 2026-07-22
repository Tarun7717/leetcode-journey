class Solution {

    public List<List<Integer>> backtrack(List<List<Integer>> res,List<Integer> set,int[] arr,int start){

        int idx=0;
        if(!res.contains(set)){
            res.add(new ArrayList<>(set));
        }
        
        for(int i=start;i<arr.length;i++){
            set.add(arr[i]);
            backtrack(res,set,arr,i+1);
            set.remove(set.size()-1);
        }
        return res;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        res = backtrack(res,new ArrayList<>(),nums,0);

        return res;

    }
}