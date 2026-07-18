class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int temp = 1, prod = 1;
        Arrays.fill(ans, 1);

        for(int i = 1; i < n; i++) {
            prod *= nums[i-1];
            ans[i] *= prod;
        }

        for(int i = n-2; i >= 0; i--) {
            temp *= nums[i+1];
            ans[i] *= temp;
        }

        return ans;
    }
}