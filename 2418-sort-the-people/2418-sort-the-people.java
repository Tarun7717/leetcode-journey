class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        

        Map<Integer,String> map = new HashMap<>();
        int n = heights.length;
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        int idx=0;
        for(int i=n-1;i>=0;i--){
            names[idx++]=map.get(heights[i]);
        }

        return names;
    }
}