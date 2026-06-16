class Solution {
    public String processStr(String s) {
        
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                sb.append(ch[i]);
            }else if(ch[i]=='*' && sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
            }else if(ch[i]=='#'){
                sb.append(sb);
            }else{
                sb.reverse();
            }
        }

        String res = sb.toString();
        return res;
    }
}
