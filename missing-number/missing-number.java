class Solution {
    public int missingNumber(int[] nums) {
       return sort(nums); 
    }
    public int sort(int arr[]){
  Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]==j){
                continue;
            }else{
                return j;
            }
        }
        return arr.length;
    }
}