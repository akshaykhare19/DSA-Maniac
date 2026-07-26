class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double avg = 0.0;

        int i = 0, j = k-1, sum = 0;
        for(int p = 0; p < k; p++) sum+=nums[p];

        avg = sum/(double)k;

        while(j < n-1) {
            // System.out.println("sum = " + sum + "\navg = " + avg);
            sum = sum - nums[i] + nums[j+1];
            i++;
            j++;
            avg = Math.max(avg, sum/(double)k);
        }
        return avg;
    }
}