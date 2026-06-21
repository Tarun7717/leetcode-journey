class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        Arrays.sort(costs);

        int n= costs.length;
        int count=0;
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=costs[i];
            if(sum<=coins){
                count++;
            }else{
                sum=0;
                count=0;
            }
            max=Math.max(max,count);
            
        }
        return max;
    }
}
