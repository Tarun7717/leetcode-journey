class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int sum2=0;
        for(int num : nums)
        {
            if(num/10<=0)
            {
                sum=sum+num;
            }else{
                sum2=sum2+num;
            }
        }
        if(sum>sum2 ||sum2>sum)
        {
            return true;
        }
        return false;
    }
}
