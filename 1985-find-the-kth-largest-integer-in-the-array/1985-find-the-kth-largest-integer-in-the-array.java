import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s= nums[i];
           BigInteger val = new BigInteger(s);
            list.add(val);
        }
        Collections.sort(list);
    BigInteger val= list.get(list.size()-k);
    return val.toString();
    }
}