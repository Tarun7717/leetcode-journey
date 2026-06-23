class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones){
            pq.add(n);
        }

        while(pq.size()>1 ){
            int n1=pq.poll();
            int n2=pq.poll();

            int res=n1-n2;
            if(res>0){
                pq.add(res);
            }

        }

        if(pq.isEmpty()){
            return 0;
        }

        return pq.peek();
    }
}
