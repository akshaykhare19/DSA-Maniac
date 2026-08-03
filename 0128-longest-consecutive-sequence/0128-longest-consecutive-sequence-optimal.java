class Solution {
    public int longestConsecutive(int[] nums) {
        System.out.println(nums.length + " - len");
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0, maxCnt = 0;
        for(int num : nums)
            set.add(num);

        for(int num : set) {
            int x = num;
            if(!set.contains(x-1)) {
                cnt = 1;
                while(set.contains(x+1)) {
                    cnt++;
                    x++;
                }
                maxCnt = Math.max(maxCnt, cnt);
            }
        }
        return maxCnt;
    }
}