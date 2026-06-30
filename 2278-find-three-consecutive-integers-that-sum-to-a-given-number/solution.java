class Solution {
    public long[] sumOfThree(long num) {
        
        long[] arr = new long[3];

        long n=num/3;

        if(num%3!=0){
            return new long[]{};
        }else{
            arr[0]=n-1;
            arr[1]=n;
            arr[2]=n+1;
        }
        return arr;

    }
}
