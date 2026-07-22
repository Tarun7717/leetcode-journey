class Solution {

    List<List<Integer>> res = new ArrayList<>();
    public void backtrack(List<List<Integer>> res,List<Integer> set,int[] arr,int start){

        if(res.contains(set)){
           return;
        }
        res.add(new ArrayList<>(set));
        for(int i=start;i<arr.length;i++){
            set.add(arr[i]);
            backtrack(res,set,arr,i+1);
            set.remove(set.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        backtrack(res,new ArrayList<>(),nums,0);
        return res;

    }
}