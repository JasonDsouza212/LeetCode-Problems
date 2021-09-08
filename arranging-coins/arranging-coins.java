class Solution {
    public int arrangeCoins(int n) {
        int ans=n;
        int i=1;
        if(n==1){
            return 1;
        }
        while(ans>0){
            ans=ans-i;
           if(ans<0){
               return i-1;
           }
            if(ans==0){
                return i;
            }
            i++;
        }
      return i;
    }
}