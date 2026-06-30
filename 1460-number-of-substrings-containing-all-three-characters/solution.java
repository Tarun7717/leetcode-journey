class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int res=0;

        int[] map = new int[3];
        
        while(r<n){
            char ch = s.charAt(r);
            map[ch-'a']++;

            while(map[0]>0 && map[1]>0 && map[2]>0) {
                res+=(n-r);
                map[s.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return res;

    }
}
