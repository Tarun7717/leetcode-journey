class Solution {
    public int[] scoreValidator(String[] events) {
        
        int score=0;
        int counter=0;
        for(String str : events){
            if(counter == 10){
                break;
            }
            if(str.length() == 1 && Character.isDigit(str.charAt(0))){
                score+=Integer.parseInt(str);
            }else if(str.equals("W") ){
                counter+=1;
            }else if(str.equals("WD") ){
                score+=1;
            }else if(str.equals("NB") ){
                score+=1;
            }
        }

        return new int[]{score,counter};
    }
}
