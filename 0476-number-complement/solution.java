class Solution {
    public int findComplement(int num) {
        String n1=Integer.toBinaryString(num);
        char[] arr = new char[n1.length()];
        int i=0;
        for(char ch : n1.toCharArray()){
            if(ch=='1'){
                arr[i++]='0';
            }else{
                arr[i++]='1';
            }
        }
        String str=String.valueOf(arr);
        return Integer.parseInt(str,2);
    }
}
