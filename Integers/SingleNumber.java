package Integers;

// https://leetcode.com/problems/single-number/description/
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        int unique = 0;
        for(int n : nums){
            unique ^= n;
        }
        return unique;
    }
}
