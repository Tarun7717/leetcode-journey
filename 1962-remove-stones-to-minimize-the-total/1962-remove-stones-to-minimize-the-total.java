class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<piles.length;i++){
            pq.offer((double)piles[i]);
        }

        int count=0;

        while(count!=k){
            double num = pq.poll();
            double res = Math.floor(num/2);
            pq.offer(num-res);
            count++;
        }

        int ans = 0;

        while(!pq.isEmpty()){
            ans+=pq.poll();
        }

        return ans;
    }
}