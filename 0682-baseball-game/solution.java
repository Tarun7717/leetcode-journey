class Solution {
    public int calPoints(String[] operations) {
        int sum=0;

        List<Integer> arr= new ArrayList<>();
        for(String op:operations)
        {
            if(!op.equals("C") && !op.equals("D") && !op.equals("+"))
            {
                arr.add(Integer.parseInt(op));
            }else if(op.equals("C"))
            {
                arr.remove(arr.size()-1);
            }else if(op.equals("D"))
            {
                arr.add(arr.get(arr.size() - 1) * 2);
            }else if(op.equals("+"))
            {
                int n1 = arr.get(arr.size() - 1);  
                int n2 = arr.get(arr.size() - 2);
                arr.add(n1+n2);
            }
        }
        if(!arr.isEmpty())
        {
            for(int num:arr)
            {
                sum+=num;
            }
            return sum;
        }
        return 0;
    }
}
