class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n-2; i++) {
            if(i > 0 && nums[i-1]==nums[i]) continue;
            int j = i+1;
            int k = n-1;
            int target = -nums[i];
            while(j < k) {
                int sum = nums[j] + nums[k];
                if(sum > target) k--;
                else if(sum < target) j++;
                else {
                    ans.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                    while(j < k && nums[j]==nums[j-1]) j++;
                    while(j < k && nums[k]==nums[k+1]) k--;
                }

            }
        }
        return ans;
    }
}