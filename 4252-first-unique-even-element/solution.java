class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
            }
        }

        for(int j=0;j<n;j++){
            if(nums[j]%2==0){
                if(map.get(nums[j])==1){
                    return nums[j];
                }  
            }
        }
        return -1;
       
    }
}
