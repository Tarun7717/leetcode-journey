class Solution {
    public int strStr(String haystack, String needle) {
        
        int res=Integer.MAX_VALUE;
        
        for(int i=0;i<=haystack.length()-needle.length();i++){
            boolean flag=false;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)==needle.charAt(j)){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                res=Math.min(res,i);
            }
        }

        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;

    }
}