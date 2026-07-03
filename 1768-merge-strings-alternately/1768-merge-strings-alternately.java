class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;

        int m=word1.length();
        int n=word2.length();
        
        StringBuilder sb = new StringBuilder();

        while(i<m || i<n){
            if(m>i){
                sb.append(word1.charAt(i));
            }
            if(n>i){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        // while(i<n){
        //     sb.append(word2.charAt(i));
        //     i++;
        // }
        // while(i<m){
        //     sb.append(word1.charAt(i));
        //     i++;
        // }

        return sb.toString();
        
    }
}