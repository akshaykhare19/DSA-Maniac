class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length, prefixSum = 0, len = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < n; i++) {
            if(nums[i]==0) prefixSum+=-1;
            else prefixSum+=1;

            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            } else {
                len = i - map.get(prefixSum);
            }

            maxLen = Math.max(len, maxLen);
        }

        return maxLen;

    }
}