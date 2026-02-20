class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
        boolean[] present=new boolean[sentence.length()];
        sentence=sentence.toLowerCase();
        int index;
        for(int i=0;i<sentence.length();i++)
        {
            char ch = sentence.charAt(i);
            if(ch>='a' && ch<='z')
            {
                index=ch-'a';
                present[index]=true;
            }
        }

        for(int i=0;i<26;i++)
        {
            if(present[i]!=true)
            {
                return false;
            }
        }
        return true;
    }
}
