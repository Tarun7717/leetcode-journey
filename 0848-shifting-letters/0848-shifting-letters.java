class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long sum=0;

        for(int n : shifts){
            sum+=n;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            long x = s.charAt(i) - 'a';
            x = (x + sum) % 26;
            char ch = (char)(x + 'a');
            sb.append(ch);
            sum-=shifts[i];
        }

        return sb.toString();
    }
}