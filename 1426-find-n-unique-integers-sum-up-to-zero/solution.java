class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
        int sum=0;
        int num=0;
        for(int i=1;i<n;i++){
                arr[num]=i;
                sum+=i;
                num++;
        }  
        arr[num]=-sum; 
        return arr;
    }
}
