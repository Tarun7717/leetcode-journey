class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
        }
        int[] arr = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            int first = pq.poll();
            int second = pq.poll();

            arr[i] = second;
            arr[i + 1] = first;

            i = i + 2;
        }
        return arr;
    }
}
