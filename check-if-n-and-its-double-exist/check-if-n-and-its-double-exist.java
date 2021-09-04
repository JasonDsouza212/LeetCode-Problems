class Solution {
    public boolean checkIfExist(int[] arr) {
        int max=Integer.MIN_VALUE;
        int num=0;
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
              if(j==i){
                  continue;
              }else{
                  if(arr[i]==arr[j]*2){
                      return true;
                  }
              }
          }
        }
         return false;
       
        }
       
    }
