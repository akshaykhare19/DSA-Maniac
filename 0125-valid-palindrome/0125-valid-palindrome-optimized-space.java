class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i < j) {
            char chi = Character.toLowerCase(s.charAt(i));
            char chj = Character.toLowerCase(s.charAt(j));
            if(!Character.isLetterOrDigit(chi)) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(chj)) {
                j--;
                continue;
            }
            if(chi != chj) return false;
            i++;
            j--;
        }
        return true;
    }
}