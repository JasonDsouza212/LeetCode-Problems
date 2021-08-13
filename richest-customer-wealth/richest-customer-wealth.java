class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max=0;
        int row=0;
        while(row<accounts.length){
            int total=0;
         for(int i=0;i<accounts[row].length;i++){
             total=total+accounts[row][i];
         }
        if(max<total){
            max=total;
        }
            row++;
        }
        return max;
    }
}