class Solution {
    public int numberOfSpecialChars(String word) {
        int count =0;

        Set<Character> set1 = new HashSet<>();
         Set<Character> set2 = new HashSet<>();
        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                set1.add(ch);
            }else{
                set2.add(Character.toLowerCase(ch));
            }   
        }

        for(char c : set1){
            if(set2.contains(c)){
                count++;
            }
        }
        return count;

    }
}
