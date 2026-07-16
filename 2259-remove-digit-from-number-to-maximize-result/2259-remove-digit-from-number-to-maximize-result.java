class Solution {
    public String removeDigit(String number, char digit) {
        
        int n=number.length();
        String max="";
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit){
                String res = number.substring(0,i) + number.substring(i+1,n);
                if(res.compareTo(max)>0){
                    max=res;
                }
            }
        }

        return max;
    }
}