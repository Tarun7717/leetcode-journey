class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        

        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(String str : words){
            boolean flag=false;
            for(char ch : str.toCharArray()){
                if(set.contains(ch)){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}