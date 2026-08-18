class Solution {
    public boolean detectCapitalUse(String word) {
        char[] arr= word.toCharArray();
       
        int n = arr.length;
        if(n == 1) {
    return true;
}
       
        if(arr[0] >= 'a' && arr[0] <= 'z'){
            int i =1;
            while(i<n){
                if(arr[i] >= 'a' && arr[i] <= 'z'){
                    i++;
                }else{
                    return false;
                } 
            }
        }else if(arr[0] >= 'A' && arr[0] <= 'Z') {
            int i =2;
                
            if(arr[1] >= 'A' && arr[1] <= 'Z'){
                while(i<n){
                    if(arr[i] >= 'A' && arr[i] <= 'Z'){
                        i++;
                    }else{
                        return false;
                    }
                }
            }else {
                 i = 1;

                while(i < n) {
                    if(arr[i] >= 'a' && arr[i] <= 'z') {
                        i++;
                    } else {
                        return false;
                    }
                }
            }
 
        }
    return true;
    }
}