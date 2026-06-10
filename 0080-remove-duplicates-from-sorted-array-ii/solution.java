class Solution {
    public int removeDuplicates(int[] nums) {
        
        int r=0;
        int l=0;
        int n=nums.length;

        while(r<n){
            int count=1;
            while(r+1<n && nums[r]==nums[r+1]){
                r+=1;
                count++;
            }
            int min=Math.min(2,count);
            for(int i=0;i<min;i++){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        
        return l;
    }
}
