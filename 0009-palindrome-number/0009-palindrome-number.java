class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x, rem = 0, nn = 0;
        while(temp > 0) {
            rem = temp % 10;
            nn = (nn * 10) + rem;
            temp/=10;
        }

        return nn==x;

    }
}