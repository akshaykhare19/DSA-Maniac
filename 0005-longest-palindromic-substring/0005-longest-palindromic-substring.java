class Solution {
    private static int[] expandFromCenter(String s, int i, int j) {
        while(i >= 0 && j < s.length() && s.charAt(i)==s.charAt(j)) {
            i--;
            j++;
        }
        return new int[]{i+1, j-1};
    }
    public String longestPalindrome(String s) {
        int boundary[] = new int[2];
        for(int i = 0; i < s.length(); i++) {
            int evenPalin[] = expandFromCenter(s, i, i+1);
            int oddPalin[] = expandFromCenter(s, i, i);
         
            int current[];
            if(evenPalin[1] - evenPalin[0] > oddPalin[1] - oddPalin[0]){
                current = evenPalin;
            } else {
                current = oddPalin;
            }

            if(current[1] - current[0] > boundary[1] - boundary[0]) {
                boundary[0] = current[0];
                boundary[1] = current[1];
            }

        }
        return s.substring(boundary[0], boundary[1]+1);
    }
}