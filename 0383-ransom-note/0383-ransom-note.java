class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0;i<magazine.length();i++){
            freq1[magazine.charAt(i)-'a']++;
        }

        for(int i=0;i<ransomNote.length();i++){
            freq2[ransomNote.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(freq1[i]<freq2[i]){
                return false;
            }
        }

        return true;
    }
}