class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
       
        int k=s1.length();
        Map<Character,Integer> map1= new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int l=0;
        int r=k-1;

        while(r<s2.length()){
            Map<Character,Integer> map2= new HashMap<>();
            for(int i=l;i<=r;i++){
                map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
            }
           
            if(map1.equals(map2)){
                return true;
            }

            r++;
            while(r-l+1>k){
                l++;
            }
        }
        return false;
    }
}