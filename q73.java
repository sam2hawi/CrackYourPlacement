class Solution {
    public void setZeroes(int[][] matrix) {
       int rows = matrix.length;
       int col = matrix[0].length; 
       boolean [][] isthere=new boolean[rows][col];
       for(int i =0 ; i<rows; i++){
        for(int j = 0 ;j<col;j++){
            if(matrix[i][j]==0){
                isthere[i][j]=true;
            }
        }
       }
       for(int i =0;i<rows;i++){
        for(int j =0;j<col;j++){
            if(isthere[i][j]){
                for(int k=0;k<col;k++){//for rows
                    matrix[i][k]=0;
                }
                for(int l=0;l<rows;l++){//for col
                    matrix[l][j]=0;
                }
            }
        }
       }
    }
}
