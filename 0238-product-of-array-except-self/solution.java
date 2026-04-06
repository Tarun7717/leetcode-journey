class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int suffix=1;
        int[] res = new int[n];
        res[0]=1;

        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]*nums[i-1];
        }

        for(int j=n-2;j>=0;j--){
            suffix*=nums[j+1];
            res[j]*=suffix;
        }
        return res;
    }
}
