class Solution {
    public int getSum(int a, int b) {
        int carry =0;
        int temp=0;
        while(b!=0){
            temp=a^b;
            carry = a & b;
            carry=carry<<1;
            a=temp;
            b=carry;
        }
        return a;
    }
}
