class Solution {
    public int bitwiseComplement(int n) {
        int result=0;
        String binary=Integer.toBinaryString(n);
        int len=binary.length();
        for(int i=0;i<len;i++)
        {
            int digit=1-(binary.charAt(i)-'0');
            result+=digit*Math.pow(2,len-i-1);
        }
        return result;
    }
}
