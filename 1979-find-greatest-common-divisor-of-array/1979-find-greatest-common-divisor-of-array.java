class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int n : nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }

        while(max!=0){
            int temp=max;
            max=min%max;
            min=temp;
        }

        return min;
    }
}