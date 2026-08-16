class Solution {
    public String longestWord(String[] words) {
        

        String res="";
        Set<String> set = new HashSet<>();

        for(String str : words){
            set.add(str);
        }
        Arrays.sort(words,(a,b)->{
            if(a.length()!=b.length()){
                return Integer.compare(b.length(),a.length());
            }
            return a.compareTo(b);
        });
        
        
        for(String str : words){
            boolean valid = true;
            for (int i = 1; i < str.length(); i++) {
            String prefix = str.substring(0, i);

            if(!set.contains(prefix)){
                valid = false;
                break;
            }
            }
            if(valid){
                return str;
            }
        }
        
        return res;
    }
}