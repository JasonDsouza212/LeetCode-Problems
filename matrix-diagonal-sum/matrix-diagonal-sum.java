class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int j= mat.length-1;
        int i=0;

       while(i<mat.length&&j>=0){
           if(i!=j){
               sum=sum+mat[i][i]+mat[i][j];
           }
           else if(i==j){
               sum=sum+mat[j][j];
           }
           i++;
           j--;

       }
        return sum;
    }
}