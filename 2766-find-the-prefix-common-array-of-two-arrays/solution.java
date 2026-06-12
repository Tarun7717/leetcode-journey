class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans = new int[n];

        Set<Integer> set = new HashSet<>();
        int count=0;
        int size=0;
        int previous=0;
        for(int i=0;i<n;i++){
            set.add(A[i]);
            set.add(B[i]);
            size=set.size();
            int difference=2-(size-previous);
            count+=difference;
            ans[i]=count;
            previous=size;
        }

        return ans;
    }
}
