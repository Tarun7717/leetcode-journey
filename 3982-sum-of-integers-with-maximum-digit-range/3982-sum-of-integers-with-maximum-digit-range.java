class Solution {
    public int maxDigitRange(int[] nums) {
        
        int digitRange=0;

        for(int n : nums){
            int min=Integer.MAX_VALUE;
            int max=0;
            
            while(n>0){
                int digit = n%10;
               min=Math.min(min,digit);
                max=Math.max(max,digit);
                n=n/10;
            }
            int range = max-min;
            digitRange=Math.max(range,digitRange);
        }

        int res=0;
        for(int n : nums){
            int temp=n;
            int min=Integer.MAX_VALUE;
            int max=0;
            while(n>0){
                int digit = n%10;
                min=Math.min(min,digit);
                max=Math.max(max,digit);
                n=n/10;
            }
            int range = max-min;
            if(range==digitRange){
                res+=temp;
            }
        }
        return res;
    }
}