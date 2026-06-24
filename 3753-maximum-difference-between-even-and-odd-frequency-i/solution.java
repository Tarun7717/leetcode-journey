class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int maxOdd=0;
        int minEven = Integer.MAX_VALUE;

        for(int n : map.values()){
            if(n%2==0){
                minEven=Math.min(minEven,n);
            }else{
                maxOdd = Math.max(maxOdd,n);
            }
        }
        return maxOdd-minEven;
    }
}
