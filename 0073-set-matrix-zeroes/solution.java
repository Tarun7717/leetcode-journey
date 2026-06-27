class Solution {
    public void setZeroes(int[][] matrix) {

        Set<Integer> row = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    if(!row.contains(i)) row.add(i);  
                    if(!cols.contains(j)) cols.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(row.contains(i) || cols.contains(j)){
                   matrix[i][j]=0;
                }
            }
        }
        
    }
}
