class Solution {
public:
    bool isPalindrome(int x) {
        long digit,res;
        long pal = 0;
        long temp=x;
        if(x<0){
            return 0;
        }
        while(x > 0){
            digit=x % 10;
            pal =pal * 10 + digit;
            x= x/10;
        }
        if(temp == pal){
           return 1;
        }else{
            return 0;
        }
    }
};
