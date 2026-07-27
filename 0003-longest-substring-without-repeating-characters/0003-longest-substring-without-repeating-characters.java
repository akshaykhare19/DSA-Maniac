class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, size = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while(r < n) {
            char ch = s.charAt(r);
            if(map.containsKey(ch)) {
                //move l to one position ahead of the character found in the map
                l = Math.max(l, map.get(ch)+1);
            } 
            map.put(ch, r);
            size = Math.max(size, r - l + 1);
            r++;
        }
        return size;
    }
}