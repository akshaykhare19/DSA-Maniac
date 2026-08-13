class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder("");
        int n = num1.length(), m = num2.length();
        int i = n - 1, j = m - 1, carry = 0, value = 0;
        while (i >= 0 && j >= 0) {
            int n1 = Character.getNumericValue(num1.charAt(i));
            int n2 = Character.getNumericValue(num2.charAt(j));
            int digSum = n1 + n2 + carry;
            carry = digSum / 10;
            value = digSum % 10;
            sb.append(value);
            i--;
            j--;
        }
        while (i >= 0) {
            int n1 = Character.getNumericValue(num1.charAt(i));
            int digSum = n1 + carry;
            carry = digSum / 10;
            value = digSum % 10;
            sb.append(value);
            i--;
        }
        while (j >= 0) {
            int n2 = Character.getNumericValue(num2.charAt(j));
            int digSum = n2 + carry;
            carry = digSum / 10;
            value = digSum % 10;
            sb.append(value);
            j--;
        }
        if (carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}