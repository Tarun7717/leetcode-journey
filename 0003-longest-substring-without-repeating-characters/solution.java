class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] arr=s.toCharArray();
        int l=0;
        int longest=0;
        Set<Character> set= new HashSet<>();
        
        for(int r=0;r<arr.length;r++){

            if(set.contains(arr[r])){
                while(set.contains(arr[r])){
                    set.remove(arr[l]);
                    l++;
                }
            }
            set.add(arr[r]);
            longest=Math.max(longest,r-l+1);
        }
        return longest;
    }
}
