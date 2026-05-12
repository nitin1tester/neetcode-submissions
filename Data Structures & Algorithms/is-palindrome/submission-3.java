
class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        char[] c = s.toCharArray();
        String actualString = "";
        for (char ch : c) {
            if (Character.isLetterOrDigit(ch)) {
                actualString = actualString + ch;
            }
        }

        System.out.println(actualString);
        String reverseString = "";
        for (int i = actualString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + actualString.charAt(i);
        }
        System.out.println("I am reverse String "+reverseString);
        if (actualString.equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }
}
