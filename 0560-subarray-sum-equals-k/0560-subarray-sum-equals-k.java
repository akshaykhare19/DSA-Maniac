class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0, n = nums.length, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int num : nums){
            currSum += num;
            if(map.containsKey(currSum-k)) 
                cnt += map.get(currSum-k);
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        return cnt;
    }
}