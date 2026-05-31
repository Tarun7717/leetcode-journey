class Solution {
    public int passwordStrength(String password) {
        Set<Character> set = new HashSet<>();
        int res=0;
        for(char ch : password.toCharArray()){
            set.add(ch);
        }

        for(char ch : set){
            if(ch>=97 && ch<=122){
                res+=1;
            }else if(ch>=65 && ch<=90){
                res+=2;
            }else if(ch>=48 && ch<=57){
                res+=3;
            }else{
                res+=5;
            }
        }
        return res;
    }
}
