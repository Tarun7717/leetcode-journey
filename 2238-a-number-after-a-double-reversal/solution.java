class Solution {
    int revNum(int n){
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int rev1=revNum(num);
        int rev2=revNum(rev1);
        return num==rev2;
    }
}
