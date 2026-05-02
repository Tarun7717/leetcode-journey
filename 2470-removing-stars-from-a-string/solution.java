class Solution {
    public String removeStars(String s) {
        
        char[] arr=s.toCharArray();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='*'){
                stk.push(arr[i]);
            }else{
                stk.pop();
            }
        }

        StringBuilder sb=new StringBuilder();
        for(Character ch : stk){
            sb.append(ch);
        }
        return sb.toString();
    }
}
