class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        int cnt = 1, maxCnt = 1;
        Arrays.sort(nums);
        for(int i = 0; i < n-1; i++) {
            if(nums[i] + 1 == nums[i+1]) {
                cnt++;
                maxCnt = Math.max(cnt, maxCnt);
            } else if(nums[i] == nums[i+1]) {
                continue;
            } else {
                cnt = 1;
            }

        }
        return maxCnt;
    }
}