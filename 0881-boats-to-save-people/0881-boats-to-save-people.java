class Solution {
    public int numRescueBoats(int[] people, int limit) {
        

        Arrays.sort(people);

        int n = people.length;
        int res=0;

        int l=0;
        int r=n-1;

        while(l<r){
            if(people[l]+people[r]<=limit){
                res++;
                l++;
                r--;
            }else {
                res++;
                r--;
            }
        }

        if(l==r){
            res++;
        }

       
        
        return res;
    }
}