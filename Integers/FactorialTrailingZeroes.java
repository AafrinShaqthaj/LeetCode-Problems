package Integers;

//https://leetcode.com/problems/factorial-trailing-zeroes/description/

/*
Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.

Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.

Example 3:

Input: n = 0
Output: 0
*/

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        int fact = 1, count=0;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            if(fact % 10 == 0){
                count++;
            }
        }
        return count;
    }
}
