class Solution {
    public int mostWordsFound(String[] sentences) {
        String[] arr=new String[sentences.length];
        int maxWords=0;
        for(String str :sentences)
        {
            arr=str.split(" ");
            int strLen=arr.length;
            if(strLen>maxWords)
            {
                maxWords=strLen;
            }
        }
        return maxWords;
    }
      
}
