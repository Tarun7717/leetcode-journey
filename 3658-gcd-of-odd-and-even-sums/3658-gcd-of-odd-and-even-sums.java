class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int a=0;
        int b=0;

        for(int i=1;i<=n*2;i++){
            if(i%2!=0){
                a+=i;
            }
        }

        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                b+=i;
            }
        }

        while(b!=0){
            int temp=b;
            b=a % b;
            a=temp;
        }

        return Math.abs(a);
    }
}