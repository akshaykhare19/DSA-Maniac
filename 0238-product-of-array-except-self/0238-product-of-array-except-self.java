class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int prodSoFar = 1;
        ans[0] = 1;
        for(int i = 0; i < n-1; i++) {
            prodSoFar *= nums[i];
            ans[i+1] = prodSoFar;
        }
        prodSoFar = 1;
        for(int i = n-1; i > 0; i--) {
            prodSoFar *= nums[i];
            ans[i-1] *= prodSoFar;
        }
        return ans;
    }
}