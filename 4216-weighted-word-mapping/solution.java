class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        String res="";
        for(int i=0;i<words.length;i++){
            int sum=0;
            String str=words[i];
            for(int j=0;j< str.length();j++){
                sum+=weights[str.charAt(j)-'a'];
            }
            int n=sum%26;
            int ans=Math.abs(n-26);
            char ch=(char)(ans+96);
            res+=ch;
        }
        return res;
    }
}
