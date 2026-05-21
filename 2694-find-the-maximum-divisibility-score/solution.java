class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int min=Integer.MAX_VALUE;
        int count=0;

        for(int div : divisors){
            int curCount=0;
            for(int num : nums){
                if(num % div ==0){
                    curCount++;
                }

                if(curCount > count || (count==curCount && div < min)){
                    count=curCount;
                    min=div;
                }
            }
        }
         return min;
    }
}
