class Solution {
    public int sumOfPrimesInRange(int n) {
        
        int temp=n;

        int rev=0;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }

        int min=Math.min(n,rev);
        int max=Math.max(n,rev);

        int sum=0;
        for(int i=min;i<=max;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count==2){
                sum+=i;
            }
        }
        return sum;
    }
}
