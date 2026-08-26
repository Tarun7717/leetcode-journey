class Solution {
    public long minimumSteps(String s) {
        
        int n = s.length()-1;
        long zeroCount=0;
        long oneCount=0;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)=='0'){
                zeroCount++;
            }else{
                oneCount+=zeroCount;
            }
        }
        return oneCount;
    }
}