class Solution {
    public String removeDigit(String number, char digit) {
        
        int n=number.length();
        String max="";
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit){
                String sub1=number.substring(0,i);
                String sub2=number.substring(i+1,n);
                String res = sub1+sub2;
                if(res.compareTo(max)>0){
                    max=res;
                }
            }
        }

        return max;
    }
}