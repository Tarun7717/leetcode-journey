class Solution {
    public int smallestNumber(int n, int t) {
        
        int len =n+10;
    for(int i=n;i<=len;i++){
        int res=1;
        int num=i;
         while(num>0){
            res*=num%10;
            num=num/10;
        }
        if(res%t==0){
            return i;
        }
    }
       return 0;
    }
}