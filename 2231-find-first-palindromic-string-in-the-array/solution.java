class Solution {
    public String firstPalindrome(String[] words) {
        for(String str:words)
        {
           StringBuilder sb= new StringBuilder(str);
           String str1=sb.reverse().toString();
           if(str.equals(str1))
           {
            return str;
           }
        }
        return "";
    }
}
