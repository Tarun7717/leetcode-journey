class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> res = new ArrayList<>();
        char[] arr1 = p.toCharArray();
        Arrays.sort(arr1); 
        for(int i=0;i<s.length()-p.length()+1;i++){
            String str = s.substring(i,i+p.length());
            char[] arr2 = str.toCharArray();
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                res.add(i);
            }
        }

        return res;
    }
}