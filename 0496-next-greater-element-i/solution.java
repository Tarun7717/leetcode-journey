class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int[] ans=new int[n];
        Stack<Integer> stk = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
         for(int i=nums2.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=nums2[i]){
                stk.pop();
            }
            if(stk.empty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],stk.peek());
            }
            stk.push(nums2[i]);
        }

        for(int j=0;j<n;j++){
            ans[j]=map.get(nums1[j]);
        }
        return ans;
    }
}
