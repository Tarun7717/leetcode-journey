class Solution {
    public int smallestNumber(int n) {
        
        String str = Integer.toBinaryString(n);
        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
        }
        String res=String.valueOf(arr);
        int ans=Integer.parseInt(res,2);

        return ans;
        
    }
}
