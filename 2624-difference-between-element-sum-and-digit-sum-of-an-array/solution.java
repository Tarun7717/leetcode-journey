class Solution {
    public int digitSum(int num){
            int digits=0;
            int digitSum=0;
             while(num!=0)
            {
                digits=num%10;
                digitSum=digitSum+digits;
                num=num/10;
            }
            return digitSum;
        }
    public int differenceOfSum(int[] nums) {
        int sum = 0;
       for(int num:nums)
       {
            sum=sum+num;
       }
       int digitSum=0;
       for(int num : nums)
       {
             digitSum=digitSum+digitSum(num);
       }

       
        return sum-digitSum;
    }
}
