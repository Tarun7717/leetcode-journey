class Solution {
    public boolean judgeCircle(String moves) {
        char[] ch=moves.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char move:ch)
        {
            map.put(move,map.getOrDefault(move,0)+1);
        }
        
        Integer U=map.getOrDefault('U',0);
        Integer D=map.getOrDefault('D',0);
        Integer L=map.getOrDefault('L',0);
        Integer R=map.getOrDefault('R',0);
        if(U.intValue()!=D.intValue() || L.intValue()!=R.intValue())
        {
            return false;
        }
        return true;
    }
}
