class Solution {

    static class Pair {
        int element, frequency;

        Pair(int ele, int freq) {
            this.element = ele;
            this.frequency = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        ArrayList<Pair> pairList = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.frequency - b.frequency);

        //populate the hashmap with frequencies
        for(int num : nums) map.put(num, map.getOrDefault(num, 0)+1);

        //iterate through the hashmap and store the result in pair array
        map.forEach((key, value) -> pairList.add(new Pair(key, value)));

        //printing pairList to check
        System.out.print("PairList: ");
        for(Pair p : pairList) {
            System.out.print("(" + p.element + ", " + p.frequency + "), ");
        }

        System.out.println();
        //filling up the priority queue of size k
        for(Pair p : pairList) {
            // System.out.println("(" + p.element + ", " + p.frequency + ")");
            if(pq.size() < k) {
                pq.offer(new Pair(p.element, p.frequency));
                System.out.println("adding new element - (" + p.element + ", " + p.frequency + ")");
            } else if(p.frequency > pq.peek().frequency) {
                System.out.println("(" + p.element + ", " + p.frequency + ") > (" + pq.peek().element + ", " + pq.peek().frequency + ")");
                pq.poll();
                pq.offer(new Pair(p.element, p.frequency));
            }
        }

        //fill us the ans array
        int i = 0;
        while(!pq.isEmpty()) {
            ans[i] = pq.poll().element;
            i++;
        }
        return ans;
    }
}