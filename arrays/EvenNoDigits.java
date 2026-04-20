package arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

/*
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
*/

public class EvenNoDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,13};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }


    // to check whether the number of digits in number is even or not
    public static boolean even(int num){
        int count = 0;
        while(num > 0){
            num/=10;
            count++;
        }
        return count%2 == 0;

    }

    //Optimized way to find number of digits
    public static int countDigits(int num){
        return (int) (Math.log10(num))+ 1;
    }
}
