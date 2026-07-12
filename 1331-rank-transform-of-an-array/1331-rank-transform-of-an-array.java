class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int n=arr.length;
        int[] copy = new int[n];

        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }
        int[] res = new int[n];
        Map<Integer,Integer> map = new HashMap<>();

        Arrays.sort(copy);
        
        int rank=0;
        for(int i=0;i<n;i++){
            if(!map.containsKey(copy[i])){
                rank=rank+1;
                map.put(copy[i],rank);
            } 
        }

        for(int i=0;i<n;i++){
            res[i]=map.get(arr[i]);
        }

        return res;
    }
}