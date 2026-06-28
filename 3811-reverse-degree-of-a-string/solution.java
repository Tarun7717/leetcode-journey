class Solution {
    public int reverseDegree(String s) {

       

        int res=0;
        for(int i =1;i<=s.length();i++){
            res+=('z'-s.charAt(i-1)+1)*i;
        }

        return res;
    }
}
