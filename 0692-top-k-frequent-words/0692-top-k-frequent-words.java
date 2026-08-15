class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> map = new HashMap<>();
        

        for(String str : words){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        List<String> res = new ArrayList<>(map.keySet());

        res.sort((a,b)->{

            if(map.get(a)!=map.get(b)){
                return Integer.compare(map.get(b),map.get(a));
            }
            return a.compareTo(b); 
        });

        List<String> list = new ArrayList<>();

        for(int i=0;i<k;i++){
            list.add(res.get(i));
        }

        return list;
        
    }
}