class Solution {
    public void sortColors(int[] nums) {
        
        int ZeroCount=0;
        int i=0;
        int TwoCount=nums.length-1;
        
        while(i<=TwoCount){
            if(nums[i]==0){
                int temp =nums[i];
                nums[i]=nums[ZeroCount];
                nums[ZeroCount]=temp;
                ZeroCount++;
                i++;
            }else if(nums[i]==2){
                int temp =nums[TwoCount];
                nums[TwoCount]=nums[i];
                nums[i]=temp;
                TwoCount--;
            }else{
                i++;
            }
           
        }



    }
}
