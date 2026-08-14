class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<senders.length;i++){
            int count=0;
            if(!map.containsKey(senders[i])){
                String[] arr = messages[i].split(" ");
                for(String str : arr){
                    count++;
                }
                map.put(senders[i],count);
            }else{
                String[] arr = messages[i].split(" ");
                for(String str : arr){
                    count++;
                }
                map.put(senders[i],map.get(senders[i])+count);
            }
        }

        String res ="a";
        int max =0;
        for(String str : senders){
           if(max<map.get(str)){
            max = map.get(str);
            res=str;
           }else if(max==map.get(str)){
            if(str.compareTo(res)>0){
                res=str;
            }
           }
        }

        return res;
    }
}