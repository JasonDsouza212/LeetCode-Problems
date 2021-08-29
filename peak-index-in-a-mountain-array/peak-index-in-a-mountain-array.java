class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ind=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                ind=i-1;
                break;
            }
        }
        return ind;
    }
}