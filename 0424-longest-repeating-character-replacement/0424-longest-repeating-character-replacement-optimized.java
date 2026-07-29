class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int freq[] = new int[26];
        int l = 0, r = 0, maxLen = 0, maxFreq = 0;

        while(r < n) {
            char chr = s.charAt(r);
            freq[chr-'A']++;
            maxFreq = Math.max(maxFreq, freq[chr-'A']);
            if((r-l+1-maxFreq) > k) {
                char chl = s.charAt(l);
                freq[chl-'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}