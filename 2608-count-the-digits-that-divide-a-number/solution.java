class Solution {
    public int countDigits(int num) {
        int count=0;
        int digit=0;
    int temp=num;
        while(temp!=0)
        {
            digit=temp%10;
            if(num%digit==0)
            {
                count=count+1;
            }
            temp = temp/10;
        }
        return count;
    }
}
