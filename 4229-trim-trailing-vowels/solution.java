class Solution {
    public String trimTrailingVowels(String s) {
        int n=s.length();
        char[] arr = s.toCharArray();
        for(int i=n-1;i>=0;i--){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||arr[i]== 'o' || arr[i]=='u' ){
                arr[i]=' ';
            }else{
                break;
            }
        }
        return String.valueOf(arr).strip();
    }
}
