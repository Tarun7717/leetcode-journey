class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        char[] str=s.toCharArray();
        for(char ch:str)
        {
                freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length;i++)
        {
            if(freq.get(str[i])==1)
            {
                return i;
            }
        }  
        return -1;
        
    }
}
