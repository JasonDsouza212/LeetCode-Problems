class Solution {
    public int[] buildArray(int[] nums) {
        int ep[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ep[i]=nums[nums[i]];
        }
        return ep;
    }
}