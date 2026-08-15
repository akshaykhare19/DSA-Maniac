class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0, flag = 1;
        long ans = 0;
        //check for spaces
        while(i < n && s.charAt(i)==' ') i++;

        //check for the sign
        if(i < n && (s.charAt(i)=='-' || s.charAt(i)=='+')) {
            if(s.charAt(i)=='-') flag = -1;
            i++;
        } 

        //check for the digit
        while(i < n && Character.isDigit(s.charAt(i))) {
            ans = (ans * 10) + Character.getNumericValue(s.charAt(i));

            if (ans > Integer.MAX_VALUE) {
                return (flag == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)ans * flag;
 
    }
}