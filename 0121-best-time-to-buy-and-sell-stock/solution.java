class Solution {
    public int maxProfit(int[] prices) {
        int prc=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prc>prices[i]){
                prc=prices[i];
            }
            profit=Math.max(profit,prices[i]-prc);
        }
        return profit;
    }
}
