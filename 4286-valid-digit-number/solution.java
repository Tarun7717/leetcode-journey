class Solution {
    public boolean validDigit(int n, int x) {
        
        if(n<10){
            return false;
        }
        String s=String.valueOf(n);

        if(s.charAt(0)==x+'0'){
            return false;
        }
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==x+'0'){
                return true;
            }
        }
        
        return false;
    }
}
