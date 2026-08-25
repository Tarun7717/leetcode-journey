class Solution {
    public int maxVowels(String s, int k) {

        int l = 0;
        int r = k - 1;
        int count = 0;
        

        for (int i = l; i <= r; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

       int res = count;

       

        
        while (r+1 <= s.length() - 1) {
            
            if (isVowel(s.charAt(r+1))) {
                count++;
            }

            if (isVowel(s.charAt(l))) {
                count--;
            }

            res = Math.max(res, count);

            l++;
            r++;
        }

        return res;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}