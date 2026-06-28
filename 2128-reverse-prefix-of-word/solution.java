class Solution {
    public String reversePrefix(String word, char ch) {
        
        char[] arr = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(char c : arr){
            if(c==ch && count==0){
                sb.append(c);
                sb.reverse();
                count++;
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
