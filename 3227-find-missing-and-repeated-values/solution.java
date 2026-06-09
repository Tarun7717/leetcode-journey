class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int sum=0;
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            if(set.contains(grid[i][j])){
                ans[0] = grid[i][j];
            }
            set.add(grid[i][j]);
            sum +=grid[i][j];
        }
        }

        int expSum =(n*n*((n*n)+1))/2;
        int b=expSum+ans[0]-sum;
        ans[1]=b;

        return ans;
    }
}
