class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()){
            return false;
        }
       
        int k=s1.length();
        Map<Character,Integer> map1= new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int l=0;
        int r=k-1;

        Map<Character,Integer> map2= new HashMap<>();
        for(int i=l;i<=r;i++){
                map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);
        }

        while(r<s2.length()-1){
            if(map1.equals(map2)){
                return true;
            }
            r++;
            map2.put(s2.charAt(r),map2.getOrDefault(s2.charAt(r),0)+1);
            while(r-l+1>k){
                if(map2.containsKey(s2.charAt(l)) && map2.get(s2.charAt(l))==1){
                    map2.remove(s2.charAt(l));
                }else{
                    map2.put(s2.charAt(l),map2.getOrDefault(s2.charAt(l),0)-1);
                }
                l++;
            }
        }
         if(map1.equals(map2)){
                return true;
        }
        return false;
    }
}