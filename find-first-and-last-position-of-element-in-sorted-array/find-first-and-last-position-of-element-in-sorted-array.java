class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] answer={-1,-1};
        int start=ans(nums,target,true);
        int end=ans(nums,target,false);
        answer[0]=start;
        answer[1]=end;
        return answer;
    }
    public int ans(int arr[],int target,boolean is){
        int ans=-1;
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(is){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}