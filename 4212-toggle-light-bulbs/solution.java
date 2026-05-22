class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        

        List<Integer> list = new ArrayList<>();

        for(Integer i : bulbs){
            if(list.contains(i)){
                list.remove(i);
            }else{
                list.add(i);
            }
        }
        Collections.sort(list);

        return list;
    }
}
