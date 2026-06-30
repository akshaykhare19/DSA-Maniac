class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[]{-1, -1};
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            int num1 = nums[i];
            for(int j = i+1; j < n; j++){
                int num2 = nums[j];
                if(num1+num2 == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}