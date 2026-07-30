class Solution {
    public int halveArray(int[] nums) {
        
        int count=0;
        double sum =0;

        Queue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            pq.offer((double)nums[i]);
            sum+=nums[i];
        }

        double n = sum/2.0;
        while(!pq.isEmpty() && sum>n){
            double num = pq.poll()/2.0;
            sum-=num;
            pq.offer(num);
            count++;
        }

        return count;
    }
}