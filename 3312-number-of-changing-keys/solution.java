class Solution {
    public int countKeyChanges(String s) {
        int count=0;
       char[] ch=s.toLowerCase().toCharArray();
        for(int i=1;i<ch.length;i++)
        {
            if(ch[i]!=ch[i-1])
            {
                count=count+1;
            }
        }
        return count;
    }
}
