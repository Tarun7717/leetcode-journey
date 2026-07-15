class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        int a=0;
        int b=0;

        for(int i=1;i<=n;i++){
            a+=i*2-1;
            b+=i*2;
        }

        while(b!=0){
            int temp=b;
            b=a % b;
            a=temp;
        }

        return Math.abs(a);
    }
}