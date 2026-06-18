class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i>=1 & i<=9){
                ans.add(i);
            }else{
                int n=i;
                boolean flag =true;
                while(n!=0){
                    int digit=n%10;
                    if(digit==0){
                        flag =false;
                        break;
                    }
                    if(i%digit!=0)
                    {
                        flag =false;
                        break;
                    }
                    n=n/10;
                }
                if(flag){
                    ans.add(i);
                }
            }
        }
        return ans;
    }
}
