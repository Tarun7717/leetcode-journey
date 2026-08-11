class Solution {
    public int maxProduct(int n) {
       
       int arr[] = new int[String.valueOf(n).length()];

       for(int i=0;i<arr.length;i++){
        arr[i]=n%10;
        n/=10;
       }

       Arrays.sort(arr);

       return arr[arr.length-1]*arr[arr.length-2];
    }
}