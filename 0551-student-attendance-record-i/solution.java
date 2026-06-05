class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        int late=0;
        for(char ch : s.toCharArray()){
            if(ch=='A'){
                absent++;
                late=0;
            }else if(ch == 'P'){
                late=0;
            }else{
                late++;
            }
            if(late==3 || absent>=2){
                return false;
            }
        }
        return true;
    }
}
