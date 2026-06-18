class Solution {
    public int minOperations(List<Integer> nums, int k) {
        
        List<Integer> li = new ArrayList<>();
        for(int i=1;i<=k;i++){
            li.add(i);
        }

        int count=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=nums.size()-1;i>=0;i--){
            int n=nums.get(i);
            if(!ans.containsAll(li)){
                ans.add(n);
                count++;
            }
            if(ans.containsAll(li)){
                return count;
            }
        }
        return count;
    }
}
