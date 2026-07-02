class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int m=s.length();
        int n=p.length();
        List<Integer> res = new ArrayList<>();

        if(m<n){
            return res;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(char ch : p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int l=0;
        int r=l+n-1;
        Map<Character,Integer> map2= new HashMap<>();

            for(int i=l;i<=r;i++){
                map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
            }
            if(map.equals(map2)){
                res.add(l);
            }
        while(r<m-1){
            map2.put(s.charAt(l),map2.get(s.charAt(l))-1);
            if(map2.get(s.charAt(l))==0){
                map2.remove(s.charAt(l));
            }
            l++;
            r++;
            map2.put(s.charAt(r),map2.getOrDefault(s.charAt(r),0)+1);
            if(map.equals(map2)){
                res.add(l);
            }
           
        }

        return res;
    }
}