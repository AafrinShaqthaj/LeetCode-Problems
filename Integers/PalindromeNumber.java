package Integers;

// https://leetcode.com/problems/palindrome-number/description/
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x!=0)) return false;
        int reverseHalf = 0;
        while (x > reverseHalf){  //121 //12  //1
            reverseHalf = reverseHalf * 10 + (x%10);  //1  //12
            x /= 10;   //12 //1
        }
        return x == reverseHalf || x == reverseHalf/10 ;
    }

}

