class Solution {
    public String minWindow(String s, String t) {

        // if(t.length() > s.length()) return "";

        HashMap<Character, Integer> mapT = new HashMap<>();
        HashMap<Character, Integer> mapS = new HashMap<>();
        int window[] = new int[2];
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        int n = s.length();
        int l = 0, r = 0, have = 0, need = t.length();
        while(r < n) {
            char ch = s.charAt(r);
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
            // System.out.println(r + " -> " + ch + " --> s -> " + mapS.get(ch) + " -- t -> " + mapT.get(ch));
            if(mapT.containsKey(ch) && mapS.get(ch)<=mapT.get(ch)) have++;

            while(have==need) {
                // System.out.println("minLen = " + minLen + ", r = " + r + ", l = " + l);
                if(minLen > r-l+1) {
                    minLen = r-l+1;
                    window[0] = l;
                    window[1] = r;
                }
                char ch1 = s.charAt(l);
                mapS.put(ch1, mapS.get(ch1)-1);
                if(mapT.containsKey(ch1) && mapS.get(ch1) < mapT.get(ch1)) have--;
                if(mapS.get(ch1)==0) mapS.remove(ch1);
                l++;
            }
            r++;
        }
        
        // String ans = "";
        // System.out.print("l = " + window[0] + ", r = " + window[1]);
        // for(int i = window[0]; i <= window[1]; i++) ans+=s.charAt(i);

        return minLen == Integer.MAX_VALUE ? "" : s.substring(window[0], window[1] + 1);

    }
}  