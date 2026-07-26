class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==map.get(arr[i])){
                res=Math.max(res,arr[i]);
            }
        }

        if(res==0){
            return -1;
        }
        return res;
    }
}