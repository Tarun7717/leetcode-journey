class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        Set<Integer> set = new HashSet<>();

        for(int num : banned){
            if(num<=n){
                set.add(num);
            }
            
        }

        int sum =0;
        int i=1;
        int count=0;
        while(i<=n && sum<=maxSum){
            if(!set.contains(i)){
                sum+=i;
                count++;
            }if(sum>maxSum){
                sum-=i;
                count--;
            }
            i++;
        }
        
        return count;
    }
}