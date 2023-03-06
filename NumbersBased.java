public class NumbersBased {

    /**
     * Problem Title: LC 9. Palindrome Number
     * Problem Link: <a href="https://leetcode.com/problems/palindrome-number/">LC 9. Palindrome Number</a>
     * --
     * Solution:
     * 1) edge case: no negative number is a Palindrome
     * 2) Construct a new number (i.e. newX) by reversing digits of x
     * 3) if x and the newly constructed number (newX) are same, we can conclude that x is Palindrome Number
     * --
     * @param x a number which can be +ive or -ive
     * @return true if x is a palindrome, false otherwise
     * --
     * Time complexity: O(log10(n)), While constructing the reverse number, we get the digits of x by dividing x by 10 in each iteration of loop
     * Space complexity: O(1), for one extra variable i.e. newX
     */
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        return x == reverseNum(x);
    }

    private int reverseNum(int x) {
        int newX = 0;

        while(x > 0) {
            newX = newX*10 + x%10;
            x = x/10;
        }
        return newX;
    }
}
