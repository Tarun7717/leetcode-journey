class Solution {
    public int minimumDistance(int[] nums) {
        
        int n=nums.length;
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1;k<n;k++){
                        if(nums[k]==nums[j]){
                            minimum=Math.min(minimum,2*(k-i));
                        }
                    }
                }
            }
        }

        if(minimum == Integer.MAX_VALUE){
            return -1;
        }
        return minimum;
    }
}
