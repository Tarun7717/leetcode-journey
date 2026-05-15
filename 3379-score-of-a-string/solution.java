class Solution {
    public int scoreOfString(String s) {
        
        char[] arr = s.toCharArray();

        int res=0;
        for(int i=0;i<s.length()-1;i++){
            int n1=arr[i];
            int n2 = arr[i+1];
            res+=Math.abs(n1-n2);
        }

        return res;
    }
}
