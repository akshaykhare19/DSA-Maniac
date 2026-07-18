class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, n = nums.length;
        while(i < n-1) {
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        nums[j] = nums[i];
        return j+1;
    }
}