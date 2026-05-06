class Solution {

    public int[] nextGreaterElements(int[] nums) {

        int n=nums.length;
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i=(2*n)-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=nums[i%n]){
                stk.pop();
            }
            if(!stk.isEmpty() ){
                ans[i%n] = stk.peek();
            }else{
                ans[i%n] = -1;
            }
            stk.push(nums[i%n]);
        }

        return ans;
    }
}
