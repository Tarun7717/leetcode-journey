class Solution {
    public int[] separateDigits(int[] nums) {
        
        
        List<Character> arr = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
           String str = Integer.toString(nums[i]);
           for(char ch : str.toCharArray()){
                arr.add(ch);
           }
        }
        
        int[] res = new int[arr.size()];
        int j=0;
        for(char n : arr){
            res[j++]=(int)n-48;
        }
        return res;
    }
}
