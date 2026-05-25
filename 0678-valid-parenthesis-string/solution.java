class Solution {
    public boolean checkValidString(String s) {
        
       
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> star = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(arr[i]=='('){
                stk.push(i);
            }else if(arr[i]=='*'){
                star.push(i);
            }else{

                if(!stk.isEmpty()){
                    stk.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else{
                    return false;
                }
            }
        }

        while(!stk.isEmpty()){
            if(star.isEmpty()){
                return false;
            }else if(star.peek()>stk.peek()){
                stk.pop();
                star.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}
