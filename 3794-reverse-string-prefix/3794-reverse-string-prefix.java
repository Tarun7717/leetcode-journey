class Solution {
    public String reversePrefix(String s, int k) {
        
        String sub=new StringBuilder(s.substring(0,k)).reverse().toString();

        for(int i=k;i<s.length();i++){
            sub+=s.charAt(i);
        }

        return sub;

    }
}