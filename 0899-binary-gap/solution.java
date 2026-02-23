class Solution {
    public int binaryGap(int n) {
        String nums=Integer.toBinaryString(n);
        int arr[]=new int[nums.length()];
        int count=0, max=0;
        for(int i=0;i<nums.length();i++)
        {
            if(nums.charAt(i)=='1')
            {
                arr[count]=i;
                count++;
            }
        }
        if(count==1)
        {
            return 0;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]>max)
            {
                max=arr[i]-arr[i-1];
            }
        }
       return max;
    }
}
