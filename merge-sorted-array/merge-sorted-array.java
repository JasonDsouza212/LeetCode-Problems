class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = m-- + n-- - 1; i > -1 && n > -1; i--) {
            if (m < 0) {
                nums1[i] = nums2[n--];
            } else if (nums1[m] >= nums2[n]) {
                nums1[i] = nums1[m--];
            } else {
                nums1[i] = nums2[n--];
            }
        }
}
}