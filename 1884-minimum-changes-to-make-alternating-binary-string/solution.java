class Solution {
    public int minOperations(String s) {
        char[] arr=s.toCharArray();
        int start0=0;
        int start1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                if(arr[i]=='0')
                {
                    start1+=1;
                }else{
                    start0+=1;
                } 
                 
            }
            else{
                if(arr[i]!='0')
                {
                    start1+=1;
                }
                else{
                    start0+=1;
                }
                
            }  
        }
        return Math.min(start0,start1);
    }
}
