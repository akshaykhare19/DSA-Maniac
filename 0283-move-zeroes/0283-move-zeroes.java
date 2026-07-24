class Solution {
    private void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int n = nums.length, i = 0, j = 0; 
        while(j < n) {
            if(nums[j]!=0) {
                if(i!=j) swap(nums, i, j);
                i++;
            }
            j++;
        }
    }
}