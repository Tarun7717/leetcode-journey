class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket=new List[nums.length+1];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int count=0;
        int[] res=new int[k];
        
        for(int pos=bucket.length-1;pos>=0 && count<k;pos--){
            if(bucket[pos]!=null){
                for(Integer num:bucket[pos]){
                    res[count++]=num;
                }
            }
        }

        return res;
        
    }
}
