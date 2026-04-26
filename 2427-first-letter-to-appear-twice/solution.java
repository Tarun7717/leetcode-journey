class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();

        char[] arr=s.toCharArray();
        for(char ch : arr){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return 't';
    }
}
