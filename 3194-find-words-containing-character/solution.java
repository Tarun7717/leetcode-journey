class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> nums=new ArrayList<>();
        int i;
        for(i=0;i<words.length;i++)
        {
            if(words[i].indexOf(x)!=-1)
            {
                nums.add(i);
            }
        }
        return nums;
    }
}
