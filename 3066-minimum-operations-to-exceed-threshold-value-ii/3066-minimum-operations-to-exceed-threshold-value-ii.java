class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            q.offer((long)nums[i]);
        }

        Long a,b;
        int count=0;

        while(!q.isEmpty() && q.peek()<k){
            if(q.size()<2){
                break;
            }

            a=q.poll();
            b=q.poll();

            Long res = Math.min(a,b)*2 + Math.max(a,b);
            q.offer(res);
            count++;
        }
        return count;
    }
}