class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;

            if (nums[m] > nums[r]) {
                //left half is sorted
                l = m + 1;
            } else {
                //right half is sorted
                r = m;
            }
        }
        return nums[l];
    }
}