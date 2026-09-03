class Solution {
    public int balancedStringSplit(String s) {
        
        int bal =0;
        int ans =0;

        for(char ch : s.toCharArray()){
            if(ch=='R'){
                bal++;
            }else{
                bal--;
            }
            if(bal==0){
                ans++;
            }
        }
        return ans;
    }
}