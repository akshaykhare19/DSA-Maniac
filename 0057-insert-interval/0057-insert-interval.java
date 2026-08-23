class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int i = 0;
        ArrayList<int[]> ans = new ArrayList<>();
        
        //before new interval
        while(i < n && intervals[i][1] < newInterval[0]) {
             ans.add(intervals[i]);
             i++;
        }

        //merge
        while(i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        //adding the new interval
        ans.add(newInterval);

        //appending the rest of the intervals as-is
        while(i < n) {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}