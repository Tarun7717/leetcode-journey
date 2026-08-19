class Solution {
    public List<Integer> findValidElements(int[] nums) {
        
        int n=nums.length;
        List<Integer> list = new ArrayList<>();

        
        for(int i=0;i<n;i++){
           boolean leftValid = true;
            boolean rightValid = true;
            for(int j=0;j<i;j++){
                if(nums[j]>=nums[i]){
                    leftValid = false;
                    break;
                }
            }

            for(int j =i+1;j<n;j++){
                if(nums[i]<=nums[j]){
                    rightValid = false;
                    break;
                }
            }

            if (leftValid || rightValid){
                list.add(nums[i]);
            }
        }

        return list;
        
    }
}