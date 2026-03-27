class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        Set<Integer> set = new HashSet<>();
        while(n!=1){
            sum=0;
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int temp =n;
            while(temp!=0){
                int digit=temp%10;
                int power=(int)Math.pow(digit,2);
                sum=sum+power;
                temp=temp/10;
            }
            n=sum;
        }
        return true;
    }
}
