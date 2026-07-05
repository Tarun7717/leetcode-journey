class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stk = new Stack<>();
        
        for(String str : tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") ){

                if(stk.size()>=2){
                    int n2=stk.pop();
                    int n1=stk.pop();
                    int ans=0;
                    switch(str){
                        case "+":
                        ans=n1+n2;
                        break;

                        case "-":
                        ans=n1-n2;
                        break;

                        case "*":
                        ans=n1*n2;
                        break;

                        case "/":
                        ans=n1/n2;
                        break;
                    }
                    stk.push(ans);
                }
            }else{
                stk.push(Integer.parseInt(str));
            }
        }

        return stk.peek();
    }
}