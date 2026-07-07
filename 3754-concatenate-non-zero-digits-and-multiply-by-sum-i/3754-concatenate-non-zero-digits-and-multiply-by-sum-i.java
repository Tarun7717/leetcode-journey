class Solution {
    public long sumAndMultiply(int n) {
        
        if(n==0){
            return 0;
        }
        StringBuilder sb = new StringBuilder();


        while(n>0){
            int digit = n%10;
            if(digit!=0){
                sb.append(digit);
            }
            n=n/10;
        }

        String str = sb.reverse().toString();
        long x = Long.parseLong(str);
        long sum = 0;

        long num = x;
        while(num>0){
            long dig = num%10;
            sum+=dig;
            num=num/10;
        }

        return sum*x;
    }
}