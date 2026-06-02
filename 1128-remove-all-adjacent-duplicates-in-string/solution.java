class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            if(!stk.isEmpty() && stk.peek()==ch){
                stk.pop();
            }else{
                stk.push(ch);
            }
        }
       for(char ch : stk){
        sb.append(ch);
       }
        return sb.toString();
    }
}
