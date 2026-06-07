class Solution {
    public int maxFreqSum(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
        int vowelCount=0;
        int consonantCount=0;

        for(char ch : s.toCharArray()){
           map.put(ch,map.getOrDefault(ch,0)+1);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                vowelCount=Math.max(map.get(ch),vowelCount);
            }else{
                consonantCount=Math.max(map.get(ch),consonantCount);;
            }
        }
        return vowelCount+consonantCount;
    }
}
