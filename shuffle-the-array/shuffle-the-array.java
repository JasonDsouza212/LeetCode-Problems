class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int m=n;
        int k=1;
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i%2==0){
                ans[i]=nums[k];
                k++;
            }else{
                ans[i]=nums[m];
                m++;
            }
        }
        return ans;
    }
}