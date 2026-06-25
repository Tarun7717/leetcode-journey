class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int[] res = new int[2];
        int idx=0;
        Set<Integer> set = new HashSet<>(); 
        for(int n : nums){
            if(set.contains(n)){
                res[idx++]=n;
            }else{
                set.add(n);
            }
            if(idx==2){
                return res;
            }
        }
        return res;
    }
}
